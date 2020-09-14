class Main inherits IO{
	a:Int;
	b:Int;
	c:Int<-1; --Variables required for the program
	d:Int;
	rem(a:Int, b:Int):Int{
   	a-(a/b)*b
   	};
   	gcd(a:Int, b:Int):Int{  --Method for GCD
   		if(a<b) then
   		{
   			gcd(b-a,a);
   		}
   		else if(b<a) then --Recursion is used for calculating gcd
   		{
   			gcd(a-b,b);
   		}
   		else a
   		fi
   		fi
   	};
	lcm(a:Int, b:Int):Int{  --Method for LCM
		if(rem(c,a)=0) then 
		{
			if(rem(c,b)=0) then c
			else 
			{
				c<-c+1;
				lcm(a,b);
			}
			fi;
		}
		else --Recursion is used for calculating lcm
		{
			c<-c+1;
			lcm(a,b);
		}
		fi
	};
	main(): Object{
		{
			while d<3 loop{
				out_string("*****Menu*****\n");
				out_string("1.LCM\n2.GCD\n3.Exit\n");
				out_string("Enter 1 for LCM and 2 for GCD\n");
				d<-in_int();
				if(d<3) then{
					out_string("Enter the two numbers you want to perform the operation on\n");
					a<-in_int();
					b<-in_int();
				}
				else out_string("")
				fi;
				if(d=1) then
				{
					out_string("The LCM is ");
					out_int(lcm(a,b)); --Calling method for finding LCM
					out_string("\n");
				}
				else if(d=2) then
				{
					out_string("The GCD is ");
					out_int(gcd(a,b));  --Calling method for finding GCD
					out_string("\n");
				}	
				else if (d=3) then
				{
					out_string("Program Closed");
				}		
				else out_string("Enter a valid choice")
				fi fi fi;
				out_string("\n\n\n");
			}
			pool;
		}
	};
};