/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinterleavetryresourcesobject3;

import java.io.IOException;

/**
 *
 * @author GENE
 */
public class FileInterLeaveTryResourcesObjectDriver3 {
    
    public static void main(String[] args) {
        String inFile1 = "E:/yao/classwork/fileinterleavetryresourcesobject3/PayrollMasterA.DAT";
        String inFile2 = "E:/yao/classwork/fileinterleavetryresourcesobject3/PayrollMasterB.DAT";
        String outFile = "E:/yao/classwork/fileinterleavetryresourcesobject3/PayrollMaster.DAT";
        String inputLine;
        
        FileInterleaveTryResourcesObject3.interleaveFiles(inFile1, inFile2, outFile);
        
        System.out.println("File Complete");
       
    }
    
}
