class Main inherits IO{
	a:Int;
	b:Int;		--Variables used for the method
	c:Int <-0;
	add(a:Int, b:Int):Int{
		a+b      --Method for Addition
	};
	rem(a:Int, b:Int):Int{
   	a-(a/b)*b    --Method for Remainder
   	};
	sub(a:Int, b:Int):Int{
		a-b      --Method for Subtraction
	};
	div(a:Int, b:Int):Int{
		a/b      --Method for Division
	};
	mul(a:Int, b:Int):Int{
		a*b      --Method for Multiplication
	};

	main():Object{
		{	
			while c<6 loop{
				out_string("*****Menu*****\n");
				out_string("1.Addition\n2.Subtraction\n3.Division\n4.Remainder\n5.Multiplication\n6.Exit\n");
				out_string("Enter the number for your choice\n");
				c<-in_int();
				if (c<6) then
				{
					out_string("Enter the two numbers you want to perform the operation on\n");
					a<-in_int(); --Taking Input
					b<-in_int();
				}
				else out_string("")
				fi;	
				if(c=1) then 
				{	
					out_string("The addition is "); 
					out_int(add(a,b)); --Calling method for addition
					out_string("\n");
				}
				else if (c=2) then
				{	
					out_string("The subtraction is ");
					out_int(sub(a,b)); --Calling method for subtraction
					out_string("\n");
				}
				else if (c=3) then
				{	
					out_string("The division is ");
					out_int(div(a,b)); --Calling method for division
					out_string("\n");
				}
				else if (c=4) then
				{	
					out_string("The remainder is ");
					out_int(rem(a,b)); --Calling method for remainder
					out_string("\n");
				}			
				else if (c=5) then
				{	
					out_string("The multiplication is ");
					out_int(mul(a,b)); --Calling method for multiplication
					out_string("\n");
				}	
				else if (c=6) then
				{
					out_string("Calculator Closed"); --Exit case for calculator
				}		
				else out_string("Enter a valid choice\n")
				fi fi fi fi fi fi;
				out_string("\n\n\n");
			}
			pool;
		}
	};
};