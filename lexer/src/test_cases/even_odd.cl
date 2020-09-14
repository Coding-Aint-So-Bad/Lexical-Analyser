class Main inherits IO{
	rem(i:Int,j:Int):Int{
		i-(i/j)*j
	};
	even_odd(x:Int):Bool{
		if(rem(x,2)=0) then true
		else false
		fi
	};


	main():Object{
		{
			out_string("Enter an integer\n");
			if(even_odd(in_int())) 
				then out_string("The given number is even\n")
			else out_string("The given number is odd\n")
			fi;
		}
	};
};