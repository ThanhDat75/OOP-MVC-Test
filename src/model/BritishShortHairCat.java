package model;

import Helper.InputHelper;

public class BritishShortHairCat extends Cat implements Meow{
    public BritishShortHairCat() {
        id = InputHelper.intHelper("Mời nhập id con mèo:");
        name = InputHelper.strHelper("Mời nhập tên con mèo:", 2, 20);
        age = (byte) InputHelper.intHelper("Mời nhập tuổi của con mèo:");
        gender = InputHelper.strHelper("Mời nhập giới tính:", 3, 3);
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.println("Loại: Mèo Anh lông ngắn.\n");
    }
    public void Meow() {
        System.out.println("Kêu kiểu mèo Anh lông ngắn.");
    }
}
