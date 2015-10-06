using System;

    class Problems
    {
        static void Main(string[] args)
        {
            
            Console.WriteLine("Hello C#");

            //print names
            Console.WriteLine("Stanislava Ivanova");
            Console.WriteLine("Stanislava"+"\n"+"Ivanova");

            //square root of the number  12345 
            int number = 12345;
            double root = Math.Sqrt(number);
            Console.WriteLine(root);

            // Print the first 10 members of the sequence:  2, -3, 4, -5, 6, -7, ... 
            int max = 10;
            int count = 1;
            int num = 2;
            do
            {
                if (num % 2 == 0 )
                {
                    Console.Write(num);
                }
                else
                {
                    Console.Write(num * (-1));
                    
                }
                if (count < max) 
                { 
                    Console.Write(", "); 
                }
                
                num++;
                count++;
            }while (count <= max);
            Console.WriteLine();

            //current date and time
            DateTime now = DateTime.Now;
            Console.WriteLine("Current date and time : " + now);

            //Age after 10 Years

            Console.WriteLine("What year are you born in? (dd.mm.yyyy)");
            DateTime birth = DateTime.Parse(Console.ReadLine());

            int mybirthYear = birth.Year;
                      
                       
            DateTime timeNow = DateTime.Now;
            int currentYear = timeNow.Year;
            int currentAge;

            //birthday has passes
            if (timeNow.Month > birth.Month)
            {
                currentAge = currentYear - mybirthYear;
            }
            else 
            {
                if (timeNow.Month == birth.Year && timeNow.Day >= birth.Day)
                {
                    currentAge = currentYear - mybirthYear;
                }
                else
                {
                    currentAge = currentYear - mybirthYear - 1;
                }
            }

            Console.WriteLine("Now you are " + currentAge);

            int ageAfter10 = currentAge + 10;
            Console.WriteLine("Your age after 10 years will be "+ageAfter10);
        }
    }
