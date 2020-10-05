package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static final String FILE_DAT = "/Users/macbookpro/Desktop/Module2/_16_IO_Binary_File_Serialization/src/exercise/PRODUCT.DAT";
    static List<Product> products = new ArrayList<>();
    public static void addProduct() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        String maSanPham = scanner.nextLine();
        System.out.print("Tên sản phẩm: ");
        String tenSanPham = scanner.nextLine();
        System.out.print("Hãng sản phẩm: ");
        String hangSanPham = scanner.nextLine();
        System.out.print("Giá sản phẩm: ");
        String giaTien = scanner.nextLine();

        System.out.print("Mô tả sản phẩm: ");
        String moTa = scanner.nextLine();

        Product product = new Product(maSanPham,tenSanPham,hangSanPham,Float.parseFloat(giaTien),moTa);

        IOFile.writeInFile(FILE_DAT, products,product);
    }



    public static void main(String[] args) {

        addProduct();

        IOFile.printFromFile(FILE_DAT);

    }
}

