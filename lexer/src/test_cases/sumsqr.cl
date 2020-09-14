class Main inherits IO{
	input:Int<-0;
	sumsqr(n:Int):Int{
		(n*(n+1)*( (2*n)+1))/6
	};


	main():Object{
		{
			out_string("The sum of squares of first n numbers\n");
			out_string("Please enter a positive integer\n");
			input<-in_int();
			out_string("The sum of first n squares = ");
			out_int(sumsqr(input));
			out_string("\n");
		}
	};
};