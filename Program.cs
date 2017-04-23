//1. 	Задача по нахождению количества цифр в числе
/*
using System;

namespace gos
{
	class Program
	{
		public static void Main(string[] args)
		{
			Console.WriteLine("Enter the number: ");
			int n=Convert.ToInt32(Console.ReadLine());
			
			int c=0;
			
			while (n>0) {
				c++;
				n=n/10;
			}
			Console.WriteLine("This number have "+c+" symbols.");
			Console.Write("Press any key to continue . . . ");
			Console.ReadKey(true);
		}
	}
}
*/

//2 	На вход подаётся последовательность из N (N < 20) целых чисел, 
//найти максимальное неположительное число в этой последовательности. 
//Если такого нет, вывести сообщение об ошибке

using System;

class gos{
	public static void Main(string[] args){
		
		int a; 										//переменная, для ввода чисел 
		Console.WriteLine("Set number of numbers"); //Задаем количество чисел
		int n=Convert.ToInt32(Console.ReadLine());
		
		if(n>20)									//Ошибка, если количество больше 20
		{
			Console.WriteLine("Set 20, or less");
			Console.Write("Press any key to continue . . . ");
			Console.ReadKey(true);
			return;
		}
		
		int[] na=new int[n];						//Массив для ввода чисел, равный величине числа цифр
		for(int i=0;i<n;i++)						//Вводим числа
		{
			Console.Write("Enter the number ");
			a=Convert.ToInt32(Console.ReadLine());
			na[i]=a;
		}
		int[] sub=new int[n];						//Массив для неположительных чисел, равный величине первого массива
		int nSub=0;
		for(int i=0;i<na.Length;i++)				//Ищем неположительные числа и заносим в массив
		{
			if (na[i]<=0)
			{
				sub[nSub]=na[i];
				nSub++;
			}
	
		}
		
		if(nSub==0)									//Ошибка и выход из программы, если все числа больше нуля
		{
			Console.WriteLine("Error!All numbers >0");
			Console.Write("Press any key to continue . . . ");
			Console.ReadKey(true);
			return;

		}
		
		
		for(int i=0;i<nSub;i++)						// Вывод всех неположительных чисел
		{
			Console.Write(sub[i]+"\n");
		}
		
			
		int max = int.MinValue;						// Поиск самого большего элемента
		for (int i = 0; i < nSub; i++)
		{
		    if (sub[i] > max)
		    {
		        									// найден больший элемент
		        max = sub[i];
		    }
		}
		
		
		
		Console.Write(max+" is maximum in array, lower than 1\n"); 
		Console.Write("Press any key to continue . . . ");
		Console.ReadKey(true);
	}
}
