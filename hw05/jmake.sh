#!/bin/bash

case $1 in
	-C|--compile)
		cp $2 bin/
		cd bin/
		javac $2
		rm $2
		cd ../
		;;
	-R|--run)
		arg=$2
		beforedot=${arg%.*}
		cd bin/
		java $beforedot
		cd ../
		;;
	-M|--make)
		arg=$2
		beforedot=${arg%.*}
		./jmake.sh -C $2
		./jmake.sh -R $beforedot
		;;
	-A|--all)	
		for java_file in *java; do
			./jmake.sh -C $java_file
		done
		for class_path in bin/*; do
			filname=${class_path#*/}
			beforedot=${filname%.*}
			cd bin/
			java $beforedot
			printf "\n\n===================\n"
			cd ../
		done
		;;
	-h|--help)
		printf "Acceptable commands:\n\t-C\t--compile <sample_file.java>\tCompiles specified file into /bin directory\n\t-R\t--run <sample_file.java>\tRuns specifice file\n\t-A\t-all\t\t\t\tCompiles every .java file in the current directory and runs them.\n\t-h\t--help\t\t\t\tPrints out this message\n"
	;;
	*)
		printf "ArgumentError:\n"
		./jmake.sh --help
esac
