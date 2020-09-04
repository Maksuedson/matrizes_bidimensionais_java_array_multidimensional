package arreio;
public class Arreios {

	public static void main(String[] args) {
		String[][] arreio = 
{
	{"Maça", "10","Madura"},
	{"Pera", "20"},
	{"Uva", "30"}, 
	{"Melancia", "40"},
	{"Goiaba", "45", "Verde" },
	{"Morango", "17"},
	{"Laranja", "22"},
	{"Manga", "25"}, 
	{"Murici", "23"}
};

		//Listar todo o arreio
		for (int linha = 0; linha < arreio.length; linha++) {
			for (int coluna = 0; coluna < arreio[linha].length; coluna++) {
				System.out.print(" "+arreio[linha][coluna]);				
			}
			System.out.print(", ");
		}
		System.out.println();
		System.out.println("====================================================================================================================");
		
		System.out.print("Item 1: ");
		System.out.print(arreio[0][0]+" ");
		System.out.print(arreio[0][1]+" ");
		System.out.print(arreio[0][2]+", ");
		
		System.out.println();
		System.out.print("Item 2: ");
		System.out.print(arreio[1][0]+" ");
		System.out.print(arreio[1][1]+", ");
		
		System.out.println();
		System.out.print("Item 3: ");
		System.out.print(arreio[2][0]+" ");
		System.out.print(arreio[2][1]+", ");
		
		System.out.println();
		System.out.print("Item 4: ");
		System.out.print(arreio[3][0]+" ");;
		System.out.print(arreio[3][1]+", ");		
		
		System.out.println();
		System.out.print("Item 5: ");
		System.out.print(arreio[4][0]+" ");;
		System.out.print(arreio[4][1]+", ");
		System.out.print(arreio[4][2]+", ");

		System.out.println();
		System.out.print("Item 6: ");
		System.out.print(arreio[5][0]+" ");
		System.out.print(arreio[5][1]+", ");

		System.out.println();
		System.out.print("Item 7: ");
		System.out.print(arreio[6][0]+" ");
		System.out.print(arreio[6][1]+", ");

		System.out.println();
		System.out.print("Item 8: ");
		System.out.print(arreio[7][0]+" ");
		System.out.print(arreio[7][1]+", ");

		System.out.println();
		System.out.print("Item 9: ");
		System.out.print(arreio[8][0]+" ");
		System.out.print(arreio[8][1]+" ");		

	}
}