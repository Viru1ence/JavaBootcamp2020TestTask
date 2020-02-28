package sef.ATestTask.FirstActivity;

import java.util.ArrayList;

public class FirstActivity {

    public static void main(String[] args) {
        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John");
        employees.add("Anton");
        employees.add("Victor");
        employees.add("Ben");
        employees.add("Marco");
        employees.add("Nathan");

        System.out.println(employees);
    }


    static void (String[] args){
        int arr[] ={860,890,690,900,1500,1000};

        System.out.println("---Array BEFORE Bubble Sort---");

        printArray(arr);

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("---Array AFTER Bubble Sort---");

        printArray(arr);

    }
    static void bubbleSort(int[] array)
    {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++) // Looping through the array length
        {  System.out.println("Sort Pass Number "+(i+1));
            for(int j=1; j < (n-i); j++)
            {
                System.out.println("Comparing "+ array[j-1]+ " and " + array[j]);
                if(array[j-1] > array[j])
                {

                    //swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    System.out.println(array[j]  + " is greater than " + array[j-1]);
                    System.out.println("Swapping Elements: New Array After Swap");
                    printArray(array);
                }

            }
        }

    }

    static void printArray(int[] array){

        for(int i=0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
}

            /*salaries.add(1000);
            salaries.add(860);
            salaries.add(760);
            salaries.add(1060);
            salaries.add(900);
            salaries.add(1230);*/


//bubblesort


//TODO 2 sort and this employees by salary (from min to max)
// TIP - google bubble sort
//		System.out.println() result

//var points = [40, 100, 1, 5, 25, 10];
//points.sort(function(a, b){return a-b});

//var car1 = "Saab";
//var car2 = "Volvo";
//var car3 = "BMW";

//var points = new Array(40, 100, 1, 5, 25, 10);


//TODO 3 create instance of a Student as a Person ->
// than ask him introduce()
// than make them Student
// than ask him introduce()



		/*public class VirtualMethodSample {
			public static void main(String arg[]){
				Person_P p = new Person_P();
				p.setName("John Doe");

				//Student inherits the methods and behavior from the Person class
				Student_P s = new Student_P();
				s.setName("Jane Doe");


				rollCall(p);
				rollCall(s);*/

        /*Person p = new Person();
        rollCall(p);
        Student d = new Student();
        rollCall(d);
        public static void rollCall(Person temp) {
            temp.announce();*/


//TODO 4 Create method for full change of employee information
// for example some employee change his work

