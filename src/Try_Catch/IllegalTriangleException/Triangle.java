package Try_Catch.IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập ba cạnh của tam giác");
            System.out.println("Nhập chiều dài cạnh thứ nhất : ");
            int firstEdge = sc.nextInt();
            System.out.println("Nhập chiều dài cạnh thứ hai : ");
            int secondEdge = sc.nextInt();
            System.out.println("Nhập chiều dài cạnh thứ ba : ");
            int thirdEdge = sc.nextInt();
            if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0) {
                throw new NegativeSideException();
            }
            if (firstEdge > secondEdge + thirdEdge || secondEdge > firstEdge + thirdEdge || thirdEdge > firstEdge + secondEdge) {
                throw new IllegalTriangleException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

