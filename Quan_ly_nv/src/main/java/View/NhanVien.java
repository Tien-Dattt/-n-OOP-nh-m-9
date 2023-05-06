/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Date;

/**
 *
 * @author LAPTOP
 */
public class NhanVien {
    private String maNV, name, sex, add, phone_number;
    private Date dob;

    public NhanVien() {
    }

    public NhanVien(String maNV, String name, String sex, String add, String phone_number, Date dob) {
        this.maNV = maNV;
        this.name = name;
        this.sex = sex;
        this.add = add;
        this.phone_number = phone_number;
        this.dob = dob;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public Date getDob() {
        return dob;                   
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
    
    
    
}
