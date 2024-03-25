/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.Patient;
/**
 *
 * @author lenovo
 */
public class PatientDao {
    public static void save(Patient patient)
    {
            String query="insert into patient(name,gender,mobileno,address,dateofbirth,bloodgroup,email) values('"+patient.getName()+"','"+patient.getGender()+"','"+patient.getMobileno()+"','"+patient.getAddress()+"','"+patient.getDateofbirth()+"','"+patient.getBloodgroup()+"','"+patient.getEmail()+"')";         
            DbOperations.setDataOrDelete(query,"Registered successfully!Wait for admin approval");                   
     }
}

