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

In the directory where the HCL Metadata tools API was extracted, copy the following java code to a file named 

`VerifyMetadataToolsInstallation.java` :

```
    public class VerifyMetadataToolsInstallation {
        public static void main(String [] args) {
            com.hcl.metadata.MetadataUtils.addMetadata("MY.LOAD.DSN", "AMEMBER", "THE_ID", "Hello World", false);
        }
    }
```

Compile the Java class using the following command:

`javac VerifyMetadataToolsInstallation.java`

Run the installation verification in the HCL Metadata Tools directory with command: 

`java VerifyMetadataToolsInstallation`

If you see a message saying that  "MY.LOAD.DSN" does not exist, that indicates the installation was successful as the DLL for HCL Metadata tools was loaded successfully.
