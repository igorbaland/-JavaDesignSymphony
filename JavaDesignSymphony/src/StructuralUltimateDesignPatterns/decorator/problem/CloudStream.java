package StructuralUltimateDesignPatterns.decorator.problem;

//read/write data to the cloud
public class CloudStream {
    public void write(String data) {
        System.out.println("Storing " + data);
        //let's say tomorrow, our certain situations
        //  we need to encrypt data before storing in the cloud
        //for example, when we are dealing with people's credit card, we don't want to store in plain text, so we
        // encrypt them.

        // we don't want to modify this class because we are not going to encrypt everything that we are going to store
        // in the cloud.
        //  We did encryption only a certain places
        /*
        How we can solve this problem?
            we can create a new class called encryptedCloudStream
                that extends this cloud stream, before writing data.

        The next problem
            In some situations, we need to compress data  before storing it in the cloud. For example, when we are
            dealing with
                large files
                images
                video files
                    we want to compress them first
                    we don't want to modify  this original class, because it's going to store data exactly as it is in
                        plain text
                    we also don't want to touch encryptedCloud stream, because we don't want necessarily need
                    compression, but we are dealing with sensitive data.

                    We should create another class
                        CompressCloudStream extends CloudStream
                            //the same structure as in a encryptionCloudStream

                        We have a problem here
                            tomorrow we must do
                                encrypt + compression data, before storing in the cloud. Our current implementation
                                does not solve this problem. We can either encrypt data or compress it.

                                So we have to create a new class
                                    CompressedAndEncryptedCloudStream extends CloudStream...


                                        For every feature we are adding
                                            we need to create various classes that combined these features...

                                            This is the problem that we can solve the
                                                decorator pattern

         */

    }

}
