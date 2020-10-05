public class GeneFinder
{
    public static String findGene(String dna)
    {
        int startIndex=dna.indexOf("ATG");
        
        if(startIndex==-1)
        {
            return "";
        }
        
        int stopIndex=dna.indexOf("TAA",startIndex + 3);
        
        if(stopIndex==-1)
        {
            return "";
        }
        
        String result="";
        
        result=dna.substring(startIndex,stopIndex+3);
        
        return result;
        
    }
    public static void main(String args[])
    {
        GeneFinder G = new GeneFinder();
        
        String outputGene= "";
        
        String dna="ATGCGTACGTGCATAACGT";
        System.out.println("DNA strand is: "+dna);
        outputGene=G.findGene(dna);
        System.out.println("Gene is: "+outputGene);
        
        String dna1="GTATGCGTAGCTGTCAGTCGATGCTAACGTACGTAAAATG";
        System.out.println("DNA strand is: "+dna1);
        outputGene=G.findGene(dna1);
        System.out.println("Gene is: "+outputGene);
        
        String dna2="TAAATG";
        System.out.println("DNA strand is: "+dna2);
        outputGene=G.findGene(dna2);
        System.out.println("Gene is: "+outputGene);
        
        String dna3="CGTAGCTAGCA";
        System.out.println("DNA strand is: "+dna3);
        outputGene=G.findGene(dna3);
        System.out.println("Gene is: "+outputGene);
        
        
    }
    
}