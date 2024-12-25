/**
 * 
 */

/**
 * @author Asim
 *
 */
// -------------------------------------------------------
// Assignment 4
// Written by: Asim Rahman 40207553
// For COMP 248 Section U – Winter 2022
// --------------------------------------------------------

//Date: April 13th 2022

/*
 Purpose: – Simple Classroom Management System
 Assuming that an instance of COMP-248 course at the Gina Cody School of Computer Science and Engineering 
was created; and this newly created object is identified via: Comp248secU. Now, you have been appointed as 
an instructor for Comp248secU. In a bid to ensure proper management of your classroom registrants, you have 
decided to develop (in Java Programming Language) a simple Classroom Management System to enable you 
effectively and efficiently manage your registrants (students) and their corresponding classroom activities.
 */

import java.util.Scanner;

class Comp248secU {
	Scanner input = new Scanner(System.in);          // These are the variables/ attributes declared in the Comp248secU class that are needed to be accessed throughout the
	private static int classSize;                    // the methods because they need to have the same values or they need to be connected 
	private static String semesterYear;              // for every methods in the program that uses these variables
	private static String lectureRoom;
	private static String instructorFname;
	private static String instructorLname ;
	private String[] studFname;
	private String[] studLname;
	private int[]  studID ;
	private double[] assgt1;
	private double[] assgt2;
	private double[] assgt3;
	private double[] assgt4;
	private double[] labs;
	private double[] midTerm;
	private double[]finalExam;
	private int total;
	private int weightID;
	private int positionDel;
	private double weightScore;
	private boolean real;
	private boolean yes;
	private int i;
	private int IDstud;
	private static char grade;
	private static double min;
	private static double max;
	private static double average;
	private double [] classmin;
	private double [] classmax;
	private double [] classavg;
	private static int count;
	private boolean fact;
	
	
public Comp248secU(String fname, String lname, String room, String semYr, int size) {
	
	Comp248secU.instructorFname = fname;           //This is the constructor where the variables/attributes are initialized
	Comp248secU.instructorLname = lname;
	Comp248secU.lectureRoom = room;
	Comp248secU.semesterYear = semYr;
	Comp248secU.classSize = size;
	this.studFname = new String [size+1];
	this.studLname = new String [size+1];
	this.studID = new int[size+1];
	this.assgt1 = new double[size+1];
	this.assgt2 = new double[size+1];
	this.assgt3 = new double[size+1];
	this.assgt4 = new double[size+1];
	this.labs = new double[size+1];
	this.midTerm = new double[size+1];
	this.finalExam = new double[size+1];
	this.classmin = new double[7];
	this.classmax = new double[7];
	this.classavg = new double[7];
	Comp248secU.count=0;
	Comp248secU.min=0.0;
	Comp248secU.max=0.0;
	Comp248secU.average=0.0;
	this.total=0;
	this.real=true;
	this.yes=true;
	this.i=0;
	
	
	
	
	System.out.println("Code => Description");                                //these are the printouts for the list of byte codes option
	System.out.println("-------------------");                                // that the user may enter.
	System.out.println("103 => Enrol New Student");                           //It will come up once the user enters the instructor's particulars
	System.out.println("106 => Find Student position in Class List");
	System.out.println("109 => Retrieve Student's Information");
	System.out.println("112 => Unenrol Student");
	System.out.println("115 => Update Student's Particulars");
	System.out.println("118 => Update Assignment Scores");
	System.out.println("121 => Update Other Scores");
	System.out.println("124 => Display Student's Report Card");
	System.out.println("127 => Dispaly Class Report Card");
	System.out.println("0 ==> Exit");
        
    }
	
	
	public int getCount( ) {              // the getCount method is an instance based method created in order to count the number of student
		                                  // that the user decides to put. Throughout the program the variable total will be user to refer to the number of students entered.
		return this.total;
	}
	public static int Count() {        //The Count method is a static based method that also counts the number of student that the user
		return count;                  // decides to put. Throughout the program the count variable will be used in a static method to refer to the number of students entered.
	}
		
	
    public void addStudent(String fname, String lname, int studID, int arrIdx) {
    	
    	arrIdx = this.total;           // The arrIdx variable is used for the index number in a array. it is initialized with the variable total that starts with value of 0.
    	this.studFname [arrIdx] = input.next();  // the user enters a first name that is put inside the studFname array
    	this.studLname [arrIdx] = input.next(); //// the user enters a last name that is put inside the studFname array
    	
    	
    	if ( input.hasNextInt() ) {               // this validates the user input in order to be sure the student ID entered is an integer
    	this.studID [arrIdx] = input.nextInt();   // the user enters a student Id that is put inside studID array
    		if (arrIdx < Comp248secU.classSize) {  // if the number of students are less than the class size than the student will be added
    	System.out.println("Student with ID: " + this.studID [arrIdx]+ " added successfully.");
    	this.total= this.total+1;     // this increments the number of student and increment the index of the array for the next student to be added in the class
    	Comp248secU.count=Comp248secU.count+1;  //this increment the number of students for the use of static methods used later in the program in order to know the number of student present.
    	
    		}
    		else {   // if the class is full, this message will appear
    			System.out.println("Student with ID: " + this.studID [arrIdx] + " CANNOT be added. Class is already full.");
    		}
    	}
    	else {  // if the user does not enter a integer, this message will appear
    		
    		System.out.println("Error your input/entry for 'StudentID' is NOT a valid integer. kindly retry again!");
    		input.next(); //this clears the scanner
    	}
    	
    	
    }

    public void Idx(int studID) {
    	this.yes=true;     // every time the Idx method is entered, the boolean yes is set to true
    	
    	this.IDstud= studID;     //the IDstud variable is for the student Id
    	if ( input.hasNextInt()) {    // this validates the user input in order to be sure the student ID entered is an integer
    		this.IDstud = input.nextInt();   //// the user enters a student Id that is put variable
    	for (this.i=0; this.i<Comp248secU.classSize; this.i++) {   // this for loop is to verify that the student ID entered already exists the array studID
    		if (this.studID[i]==this.IDstud) {
    			this.positionDel=this.i;   // this is to save position of the student in order to use it when we delete a student
    			this.weightID=this.i;      //this saves the position for when we need to put an index for the array weightScore present in the computeWeightScore method
    		this.real = true;     // if the student ID exist, the boolean real is true
    		break;
    		} //end of if statement	
    		else{
    			this.real =false;	//if the student Id does not exist, the boolean real is false
    		} // end of else statement	
    	} //end of for loop
    	
    	if (this.real==false) {   // if the student ID does not exist, this message will print
    		System.out.println("Student with ID: " + this.IDstud + " does NOT exist"); //studID	
    	}
    	} // end of first if statement
    	else {   // if the user does not enter an integer in the student ID, this message will print
    		System.out.println("Error: Your input/entry for 'StudentID' is NOT a valid integer. Kindly retry again!"); //method
    		input.next();
    		this.real=false;   //if it's not an integer the boolean real and yes are set to false
    		this.yes=false;   //the variable yes is used in other methods in order to not print out the message that it is not an integer.
    	}
    }
    public int getStudentIdx(int studID) {   //this method is used to return the student ID in the main method when user enter byte code 106
    	return this.IDstud;
    }
    public int geti(int i) {     // this return the index position and will be used numerous times to refer to the position of a student ID inside an array
    	i=this.i;
    	return i;
    }
    public boolean getReal(boolean real) {
    	
    	return this.real;        // this return the boolean value of real. it is used in the main method for byte code 106 in order to print the position of the student if student exists 
    }                            // and it is used in order method if student ID exists
    
    
    
    public String[] getStudentInfo(int studID) {
    	
    		this.Idx(studID);  // this is to access the Idx method where we get the student and see if it matches a student ID already present
    		if(this.real==true) {  // if the student ID exist, it will print print out information about a student in index position i defined earlier
    		System.out.println("Student's First Name = " +this.studFname[i] );	
    		System.out.println("Student's Lasst Name = " +this.studLname[i] );
    		System.out.println("Student's ID = " +this.studID[i] );
    		System.out.println("Score in Assignment 1 = " + this.assgt1[i]);
    		System.out.println("Score in Assignment 2 = " + this.assgt2[i]);
    		System.out.println("Score in Assignment 3 = " + this.assgt3[i]);
    		System.out.println("Score in Assignment 4 = " + this.assgt4[i]);
    		System.out.println("Cummulative Score in Labs = " + this.labs[i]);
    		System.out.println("MidTerm Test Score = " + this.midTerm[i]);
    		System.out.println("Final Examination Score = " + this.finalExam[i]);
    		}
    		
    		if (this.real==false) {  // if student ID does not exist
        		if (this.yes==true) {  // and if it is an integer that is entered for the student ID
    			System.out.println("Unable to retrieve information for student with ID: " + this.IDstud);  //then this message will print
        		}
    		}
    		
        return new String[0];
    }
    
    public int delStudent(int studID) {
    	
    	this.Idx(studID);              // this is to access the Idx method where we get the student and see if it matches a student ID already present
    	if (this.real==true) {         // if the student ID exist
    	    	for (int j=this.positionDel; j<Comp248secU.classSize; j++) {  // this method uses a for loop starting from the position of the deleted student
    	    		this.studFname [j] = this.studFname[j+1];                // it will move up the index of the array for each array so that the position of deleted student does not exist anymore
        	    	this.studLname [j] = this.studLname[j+1];
        			this.studID[j] =this.studID[j+1];
        			this.assgt1 [j] = this.assgt1 [j+1];
        	    	this.assgt2 [j] = this.assgt2 [j+1];
        	    	this.assgt3 [j] = this.assgt3 [j+1];
        	    	this.assgt4 [j] = this.assgt4 [j+1];
        	    	this.labs [j] = this.labs [j+1];
        	    	this.midTerm [j] = this.midTerm [j+1];
        	    	this.finalExam [j] = this.finalExam [j+1];   	
    		}
    	    this.total--;  // this decrement the number of student in order to have the right index for when we add another student
    	    Comp248secU.count=Comp248secU.count-1;  // this decrement the number of student for the use of static based mathods
    	    
    	    if (this.real==true) {
    		System.out.println("Successfully removed student with ID: " + this.IDstud );
    	    }
    	} // end if statement
    	
    	if (this.real==false) {  // if student does not exist
    		if (this.yes==true) {  // and if the student ID is an integer
			System.out.println("Unable to retrieve information for student with ID: " + this.IDstud); //this message will print out
			
    		}
		}
    	
        return 0;
    	
    }

    public int updateStudentPart(String fname, String lname, int studID) { //this method changes the first name and last name of a student 
    	
    	fname = input.next();  // this asks the user to enter something for the first name
    	lname = input.next();  // this asks the user to enter something for the last name
    	
    	this.Idx(studID);   // this is to access the Idx method where we get the student and see if it matches a student ID already present
    	if (this.real==true) {   //if the student ID exist
    	for (int i=0; i<Comp248secU.classSize; i++) { 
    		if (this.studID[i]==this.IDstud) {  //if the student ID matches one of the student ID
    			this.studFname [i] = fname;   //the first name will be replaced for the index of the student desired inside the array since we see if the student matches in the for loop
    	    	this.studLname [i] = lname;    //the last name will be replaced for the index of the student desired inside the array since we see if the student matches in the for loop
    		System.out.println("Successfully updated identification particulars for student with ID: " + this.IDstud );	
    		break;  //once the student ID found and the names are changed, the for loop stops
    		} //end of second if statement
		} //end of for-loop
    	} // end of first if statement
    	
    	if (this.real==false) {  // if student ID does not exist
    		if (this.yes==true) {  // and the student ID entered is an integer
			System.out.println("Unable to retrieve information for student with ID: " + this.IDstud); // this message will print
			this.yes=true;
    		}
    	}
        return 0;
    }

    public int updateAssgtScore(double a1, double a2, double a3, double a4, int studID) {  //this method is used to assign or update values for the assignments of a student
    	
    	a1 = input.nextDouble();  //this is for the user to enter values for assignments 1,2,3 and 4
    	a2 = input.nextDouble();
    	a3 = input.nextDouble();
    	a4 = input.nextDouble();
    	this.Idx(studID);        // this is to access the Idx method where we get the student and see if it matches a student ID already present
    	if (this.real==true) {  //if the student ID exist
    		
    	for (int i=0; i<Comp248secU.classSize; i++) {
    		if (this.studID[i]==this.IDstud) {  //if the student ID matches one of the student ID
    			this.assgt1 [i] = a1;           // the values for assignments will be entered in their respective arrays with the index of the student desired since we see if the student matches in the for loop
    	    	this.assgt2 [i] = a2;
    	    	this.assgt3 [i] = a3;
    	    	this.assgt4 [i] = a4;
    		System.out.println("Successfully updated assignment scores for student with ID: " + this.IDstud );	
    		break;  //once the student ID found and the assignment values are changed or assigned, the for loop stop
    	} //end of second if statement	
    	} //end of for loop
    	} // end of first if statement
    	if (this.real==false) { //if student ID does not exist
    		if (this.yes==true) {  //and if the student ID entered is an integer
			System.out.println("Unable to retrieve information for student with ID: " + this.IDstud); //this message will print
			this.yes=true;
    		}
    	}
        return 0;
    }

    public int updateOtherScore(double lab, double test, double exam, int studID) {  //this method is used to assign or update values for labs, midterm and final of a student
    	
    	lab = input.nextDouble();          //this is for the user to enter values for labs, midterm and final
    	test = input.nextDouble();
    	exam = input.nextDouble();
    	
    	this.Idx(studID);        // this is to access the Idx method where we get the student and see if it matches a student ID already present
    	if (this.real==true) {   //if the student ID exist
    	for (int i=0; i<Comp248secU.classSize; i++) {
    		if (this.studID[i]==this.IDstud) {  //if the student ID matches one of the student ID
    			this.labs [i] = lab;            // the values for labs, midterm and final will be entered in their respective arrays with the index of the student desired since we see if the student matches in the for loop
    	    	this.midTerm [i] = test;
    	    	this.finalExam [i] = exam;	
    	    	System.out.println("Successfully updated Cummulative Labs, Mid-Term, and Final Examination scores for student with ID: " + this.IDstud );		
    	    	break;     ///once the student ID found and the values for labs, midterm and final are changed or assigned, the for loop stop
    		} //end of second if statement	
    	} //end of first for loop
    	} // end of first if statement
    	if (this.real==false) {     //if student ID does not exist
    		if (this.yes==true) {    //and if the student ID entered is an integer
			System.out.println("Unable to retrieve information for student with ID: " + this.IDstud); //this message will print
			this.yes=true;
    		}
    	}
        return 0;
    }

    public double computeWeightScore(int studID) {       // this method is used to count how many points the student has accumulated in total
    	if (this.real) {                               //if the student ID exist
    	this.weightScore = (((this.assgt1 [this.weightID])*2.0)/20.0)+(((this.assgt2 [this.weightID])*3.0)/20.0)+(((this.assgt3 [this.weightID])*5.0)/20.0)+  // the weightID is the index of the array of the student that was saved in the Idx method
    			(((this.assgt4 [this.weightID])*8.0)/20.0)+(((this.labs [this.weightID])*12.0)/12.0)+(((this.midTerm [this.weightID])*30.0)/30.0)+            // we use a cross product to see how many point the student has gained for each evaluation and sum it all up with all his evaluation
    			(((this.finalExam [this.weightID])*40.0)/40.0);                                                                                               // the cross product is the ((score on the evaluation out of the max score)*(the weight of evaluation))/(the max score on the evaluation)
    	}                                                                                                                                                     //then we sum up each cross product
    	
        return this.weightScore;     //this returns the total number of points that the student acquired
    	                             // this method returns the value in the main method
    	
    }
    public double weightScore(int k) {     // the weightScore method is the same as the computeScore but used for the classReportCard method
    	                                   // the variable k is for the index of the student that will be chosen in a for loop inside the classReportCard method
    	this.weightScore = (((this.assgt1 [k])*2.0)/20.0)+(((this.assgt2 [k])*3.0)/20.0)+(((this.assgt3 [k])*5.0)/20.0)+
    			(((this.assgt4 [k])*8.0)/20.0)+(((this.labs [k])*12.0)/12.0)+(((this.midTerm [k])*30.0)/30.0)+
    			(((this.finalExam [k])*40.0)/40.0);
    	
    	
        return this.weightScore;
    	
    	
    }

    public static char computeGrade(double wgtScore) {   // this method is to letter grade according to the weightScore
    	
    	char grade='A';   // the default letter grade is A
    	if (wgtScore>=88) {   //if the weightScore is 88 or more than the letter grade is A
    		grade='A';
    	}
    	else if (wgtScore>=80) {   //if the weightScore is 80 or more than the letter grade is B
    		grade='B';
    	}
    	else if (wgtScore>=67) {  //if the weightScore is 67 or more than the letter grade is C
    		grade='C';
    	}
    	else if (wgtScore>=60) {  //if the weightScore is 60 or more than the letter grade is D
    		grade='D';
    	}
    	else  {                    //if the weightScore is less than 60 or more than the letter grade is F
    		grade='F'; 
    	} 
    	
        return grade;
    }

    public static double findMin(double[]dataArr) {  //this is a method to find a minimum value inside an array
    	
    	min=dataArr[0];                              //the default minimum value is index 0 of the array
    	for (int j=0; j<Comp248secU.count;j++) {     // the for loop starts with index 0 and increments the index until in reaches the number of student entered
    		if(dataArr[j]<min) {                     // if the value inside the index is less than the current minimum assigned 
    			min=dataArr[j];                     // than we have a new minimum value
    		}
    	}
    	
        return min;                               // this returns the minimum value
    }

    public static double findMax(double[]dataArr) {   //this is a method to find a maximum value inside an array
    	max=dataArr[0];                               //the default maximum value is index 0 of the array
    	for (int j=0; j<Comp248secU.count;j++) {      // the for loop starts with index 0 and increments the index until in reaches the number of student entered
    		if(dataArr[j]>max) {                     // if the value inside the index is less than the current maximum assigned
    			max=dataArr[j];                     // than we have a new maximum value
    		}
    	}
        return max;                                // this returns the minimum value
    }

    public static double findAvg(double[]dataArr) {   //this method is to find the average value inside an array
    	double sum=0;                                 //the default sum value is 0
    	for (int j=0; j<Comp248secU.count;j++) {      //the for loop starts with index 0 and increments the index until in reaches the number of student entered
    		sum+=dataArr[j];                          // this increment the sum by the value inside the array
    	}
    	average = sum/Comp248secU.count;              // the average value is the total sum incremented throughout the array
        return Math.round(average*100.0)/100.0;        // this rounds the average
    }

    public double[] getClassMin() {                   // this method uses the findMin method to find the minimum value for each evaluation and stores it in the array classmin array
    	this.classmin[0]=findMin(this.assgt1);
    	this.classmin[1]=findMin(this.assgt2);
    	this.classmin[2]=findMin(this.assgt3);
    	this.classmin[3]=findMin(this.assgt4);
    	this.classmin[4]=findMin(this.labs);
    	this.classmin[5]=findMin(this.midTerm);
    	this.classmin[6]=findMin(this.finalExam);
        
    	return new double[0];
    }

    public double[] getClassMax() {             // this method uses the findMax method to find the maximum value for each evaluation and stores it in the array classmax array
    	this.classmax[0]=findMax(this.assgt1);
    	this.classmax[1]=findMax(this.assgt2);
    	this.classmax[2]=findMax(this.assgt3);
    	this.classmax[3]=findMax(this.assgt4);
    	this.classmax[4]=findMax(this.labs);
    	this.classmax[5]=findMax(this.midTerm);
    	this.classmax[6]=findMax(this.finalExam);
    	
    	return new double[0];
    }

    public double[] getClassAvg() {              // this method uses the findMin method to find the average value for each evaluation and stores it in the array classavg array
    	this.classavg[0]=findAvg(this.assgt1);
    	this.classavg[1]=findAvg(this.assgt2);
    	this.classavg[2]=findAvg(this.assgt3);
    	this.classavg[3]=findAvg(this.assgt4);
    	this.classavg[4]=findAvg(this.labs);
    	this.classavg[5]=findAvg(this.midTerm);
    	this.classavg[6]=findAvg(this.finalExam);
    	
    	return new double[0];
    }

    public void classReportCard() {	   //this print out the class report card
    	System.out.println("---------------------------------------------------------------------------------------------------");
    	System.out.printf("%-16s%-16s%s%7s%7s%7s%7s%7s%7s%7s%8s%2s", "First Name", "Last Name", "stud. ID", "A1", "A2", "A3", "A4", "Labs", "Test", "Exam", "Wgt.", "*"); // this is to print the strings with the right amount of space between them
    	System.out.println("\n---------------------------------------------------------------------------------------------------");
       
    	for (int j=0;j<this.total;j++) {   // this is a for loop to print the names and the scores with the appropriate index in the array in order to print the values for each student
    		String firstName=studFname[j], lastName=studLname[j]; //it starts with index 0, which is the first student. Once a iteration is complete, one row is complete for the values of one student
    		int ID =this.studID[j];                                // the for loop continues to increment until the number of students entered
    		double a1=this.assgt1[j], a2=this.assgt2[j], a3=this.assgt3[j], a4=this.assgt4[j], lab=this.labs[j], mt=this.midTerm[j], fe=this.finalExam[j], score =weightScore(j);
    		System.out.printf("%-16s%-16s%8d%7.2f%7.2f%7.2f%7.2f%7.2f%7.2f%7.2f%8.2f%2s%n", firstName, lastName, ID, a1, a2, a3, a4, lab, mt, fe, score, computeGrade(score));
    	}
    	
    	System.out.println("---------------------------------------------------------------------------------------------------");
    	System.out.printf("%39s%8.2f%7.2f%7.2f%7.2f%7.2f%7.2f%7.2f", "Minimum Score in Class:",this.classmin[0],this.classmin[1],this.classmin[2],this.classmin[3],this.classmin[4],this.classmin[5],this.classmin[6]);    // this is to print the minimum value of each evaluation( each index corresponds to a evaluation) for the total number of students entered. It prints the right amount of space in between each minimum value.
    	System.out.printf("%n%39s%8.2f%7.2f%7.2f%7.2f%7.2f%7.2f%7.2f", "Average Score in Class:",this.classavg[0],this.classavg[1],this.classavg[2],this.classavg[3],this.classavg[4],this.classavg[5],this.classavg[6]);  // this is to print the average value of each evaluation( each index corresponds to a evaluation) for the total number of students entered. It prints the right amount of space in between each average value.
    	System.out.printf("%n%39s%8.2f%7.2f%7.2f%7.2f%7.2f%7.2f%7.2f", "Maximum Score in Class:",this.classmax[0],this.classmax[1],this.classmax[2],this.classmax[3],this.classmax[4],this.classmax[5],this.classmax[6]);   // this is to print the maximum value of each evaluation( each index corresponds to a evaluation) for the total number of students entered. It prints the right amount of space in between each maximum value.
    	System.out.println("\n---------------------------------------------------------------------------------------------------");
    }

}


public class A4_Q1_Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter instructor's particulars (FirstName, LastName, LectureRoom, Semester, MaxClassSize) as a single entry:");
		Scanner input = new Scanner(System.in);
		String fname = input.next();       // this is for the user to enter the instructors first name
		String lname = input.next();       // this is for the user to enter the instructors last name
		String room = input.next ();       // this is for the user to enter the lecture room
		String semYr = input.next();       // this is for the user to enter the semester and year
		
		int studID=0;                      // this is to  to declare and initialize the value that are going in the parameters of method that we are calling for
		int size=0;
		double a1=0.0,  a2=0.0,  a3=0.0,  a4=0.0;
		double lab=0.0 , test=0.0, exam=0.0;
		byte code =0;
		boolean real= true;
		
				
		if (input.hasNextInt()) {  // this is to verify that the user enter a integer for the class size
			size = input.nextInt();  // the user enter a value for the class size
		}
		else {  // if the user does not enter an integer for the class size
			System.out.println("Error: Your input/Entry for 'MaxClassSize is NOT a valid integer. Kindly retry again!"); // this message prints
			System.exit(0);   // and the program stops
		}
		Comp248secU courseInfo = new Comp248secU(fname, lname, room, semYr, size);   //courseInfo is the name of the object we created. this calls the constructor where we have placed the menu
		                                                                             // for the list of byte code that the user can enter
		System.out.println("");
		System.out.print("Please enter a Code, from the aforementioned, that corresponds to your task: ");
		
		while (real) {   //this while loop is  made so that the program continues to ask the user to put a byte value for the code
			
		if (input.hasNextByte()) {   //this verifies that the user puts a byte value
		code = input.nextByte();	
		}
		else {  //this message will print if the user does not enter a byte values
			System.out.println("Error: Your input/Entry is not a valid integer between -128 to 127. Kindly retry again!");
		}     // this if statement is if the user does not enter a byte value mentioned in the menu for the list of codes
		if (code!=103 && code!=106 && code !=109 && code !=112 && code !=115 && code !=118 && code !=121 && code !=124 && code !=127 && code!=0) {
		System.out.println("");
		System.out.println("Thank you for patronizing our Simple Classroom Management System.");
		System.exit(0);
		}
		System.out.println("");
		System.out.println("");
		
		
		
		switch(code) {   // we use a switch statement to see happens in scenario of code
		
		case 103:       // if the user enters code 103
			System.out.println("Enrolling New Student...");
			System.out.println("------------------------");
	    	System.out.println("Enter student's particulars (FirstName, LastName, StudentID) as a single-line entry:");
	    	courseInfo.addStudent(fname, lname, studID, courseInfo.getCount() );   // this calls for the addStudent method where we add a student in class. It calls for the getCount method in the parameter since it counts the numbers of students entered.
	    	System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: "); 
	    	break;
		case 106:    // if the user enters code 106
			System.out.println("Finding Student's Position in Class List...");
			System.out.println("--------------------------------------------");
	    	System.out.println("Enter student ID:");
	    	courseInfo.Idx(0);     // this calls for the Idx method where we see if the user enters the right student ID
	    	if (courseInfo.getReal(true)==true) {  // if the user enters a student ID that exist
    		 System.out.println("The position of student with ID: " + courseInfo.getStudentIdx(0) + ", in the class is: " + courseInfo.geti(0));  // it will print out the position of the student with the student ID entered
    		}
	    	
	    	System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
	    	break;
		
		case 109:   // if the user enters code 109
			System.out.println("Retrieving Student's Information...");
			System.out.println("--------------------------------------------");
	    	System.out.println("Enter student ID:");
	    	courseInfo.getStudentInfo(studID);   // this calls for the getStudentInfo method where we see various information about the student like his name and his scores in evaluations
	    	System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
			break;
		case 112:     // if the user enters code 112
			System.out.println("Unenrolling New Student...");
			System.out.println("---------------------------");
	    	System.out.println("Enter student ID:");
	    	courseInfo.delStudent(studID);    // this calls for the delStudent method where we delete a student
	    	System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
			break;
		case 115:     // if the user enters code 115
			System.out.println("Update Student's particulars...");
			System.out.println("-------------------------------");
			System.out.println("Enter update to student's particulars (FirstName, LastName, StudentID) as a single entry:");
	    	courseInfo.updateStudentPart(fname, lname, studID);    // this calls for the updateStudentPart where we modify the first and last name of a student
	    	System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
			break;
		case 118:  // if the user enters code 118
			System.out.println("Updating Assignment scores...");
			System.out.println("----------------------------");
			System.out.println("Enter update to student's scores (Assignment 1, Assignment 2, Assignment 3, Assignment 4, StudentID) as a single entry:");
	    	courseInfo.updateAssgtScore( a1,  a2, a3,  a4, studID); // this calls for the updateAssgtScore method where the user assigns or updates the values for assignments
	    	System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
			break;
		case 121: // if the user enters code 121
			System.out.println("Updating Other scores...");
			System.out.println("----------------------------");
			System.out.println("Enter update to student's scores (CummulativeLabs, Midterm, FinalExam, StudentID) as a single entry:");
	    	courseInfo.updateOtherScore(lab, test, exam, studID);  // this calls for the updateOtherScore method where the user assigns or updates the values for labs, midterm and final
	    	System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
			break;
		case 124:  // if the user enters code 124 
			System.out.println("Displaying Student's Report Card...");
			System.out.println("-----------------------------------");
			System.out.println("Enter student ID:");
	    	courseInfo.getStudentInfo(studID); // this calls for the getStudentInfo method where we see various information about the student like his name and his scores in evaluations
	    	if (courseInfo.getReal(true)==true) { // if the student exists
	    	System.out.println("-------------------------");
	    	System.out.println("Student's Cummulative Weighted Score =: " +courseInfo.computeWeightScore(studID)); // this will print the accumulated points the student got by calling for the computeWeightScore
	    	System.out.println("Student's Final Letter Grade= "+ Comp248secU.computeGrade(courseInfo.computeWeightScore(studID)));  // this will print out the letter grade by calling for the computeWeightGrade method with parameter computeWeightScore method
	    	}
	    	System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
			break;
		case 127: // if the user enters code 127
			System.out.println("Displaying Student's Report Card...");
			System.out.println("-----------------------------------");
			courseInfo.getClassMin();  // this calls for the getClassMin method in order to use the variable inside of them during the methods
			courseInfo.getClassMax();  // this calls for the getClassMax method in order to use the variable inside of them during the methods
			courseInfo.getClassAvg();  // this calls for the getClassAvg method in order to use the variable inside of them during the methods
			courseInfo.classReportCard();  //this calls for the classReportCard method
			System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
			break;
		case 0:  // if the user enters code 0
			System.out.println("Thank you for using this Simple Classroom Management System!");   // close message
			System.exit(0); //the program stops
			break;
			
			

		
		} //end of switch
	} //end of while loop
	}
}
