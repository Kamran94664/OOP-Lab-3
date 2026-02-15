package Task4;

public class Computer {

        private String systemId;
        private String processorType;
        private int ramSize;
        private String operatingSystem;
        Computer(){
        }
         Computer(String systemId, String processorType, int ramSize, String operatingSystem) {
            this.systemId = systemId;
            this.processorType = processorType;
            this.ramSize = ramSize;
            this.operatingSystem = operatingSystem;
        }

        public void displayDetails() {
            System.out.println("System ID: " + systemId +"Processor: " + processorType+ "RAM: " + ramSize + "GB"+"Operating System: " + operatingSystem);
        }

     public static void main(String[] args) {

          Computer c1 = new Computer("PC101", "Intel i5", 8, "Windows 10");
          Computer c2 = new Computer("PC102", "AMD Ryzen 7", 16, "Windows 11");

            c1.displayDetails();
            c2.displayDetails();
        }
    }

