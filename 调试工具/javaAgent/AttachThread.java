package com.lk.javaAgent;


 // 一个运行 Attach API 的线程子类

import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

import java.util.List;

class AttachThread {

         public static void main(String[] args) throws Exception {
             List<VirtualMachineDescriptor> list = VirtualMachine.list();
             for (VirtualMachineDescriptor vmd : list) {
                 if (vmd.displayName().endsWith("TestMainInJar")) {
                     System.out.println(vmd.displayName());
                     VirtualMachine virtualMachine = VirtualMachine.attach(vmd.id());
                     virtualMachine.loadAgent("F:\\tools\\idea\\workspace\\lucene\\target\\lucene-1.0-SNAPSHOT.jar", "cxs");
                     System.out.println("ok");
                     virtualMachine.detach();
                 }
             }

         }

}