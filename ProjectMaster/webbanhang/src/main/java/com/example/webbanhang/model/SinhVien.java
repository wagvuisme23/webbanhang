package com.example.webbanhang.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.web.multipart.MultipartFile;
public class SinhVien {
    @NotBlank(message = "Tên là bắt buộc")
    private String ten;
    @Min(value = 18, message = "Tuổi phải lớn hơn hoặc bằng 18")
    @Max(value = 100, message = "Tuổi phải nhỏ hơn hoặc bằng 100")
    private int tuoi;
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Khoa phải là chữ")
    private String khoa;
    // Getters and Setters
    private MultipartFile image;
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getKhoa() {
        return khoa;
    }
    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
