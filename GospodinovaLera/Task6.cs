﻿using System;
using System.Collections.Generic;

namespace tutorial
{

    class Program
    {
        public static void readWrite()
        {
            char c = Convert.ToChar(Console.Read());
            if (c != '.')
            {
                readWrite();
                Console.Write(c);
            }
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Put dot when you would like to end. Everything after dot wont be reversed");
            readWrite();
            Console.ReadKey();
        }
    }
}