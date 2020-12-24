public class VerifyMetadataToolsInstallation {
    public static void main(String [] args) throws Exception {
            com.hcl.metadata.MetadataUtils.addMetadata("MY.LOAD.DSN", "AMEMBER", "THE_ID", "Hello World", false);
    }
}