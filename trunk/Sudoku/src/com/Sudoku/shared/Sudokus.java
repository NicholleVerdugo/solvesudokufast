package com.Sudoku.shared;

public class Sudokus {

	public static int[][] s = { 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
	
	// Muy Dificil
	public static int[][] s1 = { 
		{ 0, 0, 5, 3, 0, 0, 0, 0, 0 },
		{ 8, 0, 0, 0, 0, 0, 0, 2, 0 }, 
		{ 0, 7, 0, 0, 1, 0, 5, 0, 0 },
		{ 4, 0, 0, 0, 0, 5, 3, 0, 0 }, 
		{ 0, 1, 0, 0, 7, 0, 0, 0, 6 },
		{ 0, 0, 3, 2, 0, 0, 0, 8, 0 },
		{ 0, 6, 0, 5, 0, 0, 0, 0, 9 }, 
		{ 0, 0, 4, 0, 0, 0, 0, 3, 0 },
		{ 0, 0, 0, 0, 0, 9, 7, 0, 0 } };

	
	//Dif�cil
	public static int[][] s2 = { 
		{ 0, 0, 0, 0, 0, 0, 2, 0, 0 },
		{ 0, 2, 0, 0, 9, 3, 0, 4, 7 }, 
		{ 7, 0, 3, 6, 2, 0, 0, 9, 0 },
		{ 3, 0, 0, 0, 0, 0, 7, 0, 0 }, 
		{ 0, 0, 0, 2, 0, 9, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0, 0, 9 },
		{ 0, 6, 0, 0, 4, 2, 1, 0, 5 }, 
		{ 8, 1, 0, 3, 5, 0, 0, 6, 0 },
		{ 0, 0, 4, 0, 0, 0, 0, 0, 0 } };
	
	
	//F�cil
	public static int[][] s3 = { 
		{ 1, 0, 9, 3, 6, 0, 0, 4, 5 },
		{ 0, 0, 8, 9, 2, 0, 6, 0, 0 }, 
		{ 0, 3, 0, 0, 0, 0, 2, 0, 1 },
		{ 0, 0, 0, 0, 3, 2, 0, 5, 0 }, 
		{ 9, 0, 0, 0, 7, 0, 0, 0, 8 },
		{ 0, 1, 0, 8, 9, 0, 0, 0, 0 },
		{ 4, 0, 3, 0, 0, 0, 0, 8, 0 }, 
		{ 0, 0, 1, 0, 5, 9, 3, 0, 0 },
		{ 7, 9, 0, 0, 8, 3, 5, 0, 4 } };
	
	//Muy Dif�cil
	public static int[][] s4 = { 
		{ 0, 0, 0, 0, 2, 5, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 7, 3, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 4, 8, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 5, 9 }, 
		{ 7, 0, 0, 0, 0, 0, 0, 0, 2 },
		{ 3, 8, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 9, 5, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 1, 6, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 8, 3, 0, 0, 0, 0 } };
	
	//Publimetro 110331
	public static int[][] s5 = { 
		{ 0, 0, 0, 2, 0, 9, 8, 5, 0 },
		{ 8, 0, 9, 0, 0, 3, 0, 6, 0 }, 
		{ 6, 0, 0, 7, 8, 0, 9, 0, 0 },
		{ 2, 1, 0, 0, 4, 7, 6, 0, 5 }, 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 5, 0, 7, 1, 0, 0, 3, 4, 8 },
		{ 0, 0, 4, 0, 7, 1, 0, 0, 6 }, 
		{ 0, 8, 0, 9, 0, 0, 4, 0, 7 },
		{ 0, 2, 6, 4, 0, 5, 0, 0, 0 } };
	
	//Muy Dif�cil
	public static int[][] s6 = { 
		{ 0, 2, 8, 0, 0, 0, 0, 0, 5 },
		{ 0, 0, 0, 3, 4, 0, 2, 0, 1 }, 
		{ 0, 0, 7, 0, 0, 0, 6, 0, 0 },
		{ 0, 0, 1, 0, 3, 8, 0, 2, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 3, 0, 2, 6, 0, 1, 0, 0 },
		{ 0, 0, 3, 0, 0, 0, 8, 0, 0 }, 
		{ 1, 0, 9, 0, 7, 6, 0, 0, 0 },
		{ 5, 0, 0, 0, 0, 0, 7, 9, 0 } };

	//Dif�cil
	public static int[][] s7 = { 
		{ 0, 6, 0, 0, 0, 3, 5, 0, 8 },
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
		{ 7, 0, 0, 2, 8, 0, 0, 6, 4 },
		{ 0, 0, 5, 0, 3, 2, 0, 0, 1 }, 
		{ 4, 0, 0, 0, 0, 0, 0, 0, 3 },
		{ 8, 0, 0, 9, 1, 0, 6, 0, 0 },
		{ 3, 8, 0, 0, 9, 4, 0, 0, 5 }, 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 1, 0, 9, 3, 0, 0, 0, 0, 0 } };
}
