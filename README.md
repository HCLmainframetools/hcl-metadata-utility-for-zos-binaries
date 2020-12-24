HCL Metadata Utilities for z/OS
=======================================

The repositories contains the Java API for HCL Metadata Utilities for z/OS.

System Requirements
---------------------------
- z/OS 2.2 or newer
- Java 8 31 or 64 bit
- TSO region size: 64 M or larger

Installation Instructions
-----------------------------

1) Download the latest version of HCLMetadataUtilsJavaAPIBinary.x.y.z.zip
2) Extract the zip file
3) Using Binary mode FTP, upload the extracted files to a HFS directory on your z/OS system
4) Specify the name HFS directory name in the configuration of the tool using the HCL Metadata Tools API

Installation Verification
---------------------------

1) Copy `VerifyMetadataToolsInstallation.java` to the directory where the HCL Metadata tools API was extracted.

2) Compile the Java class using the following command:

         javac VerifyMetadataToolsInstallation.java

3) Run the installation verification with : 

        java VerifyMetadataToolsInstallation

The installaton was a success if a message saying "MY.LOAD.DSN" does not exist is displayed.
This message indicates the HCL Metadata Utilities DLL was found and loaded successfully.
