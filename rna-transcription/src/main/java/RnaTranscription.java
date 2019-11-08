class RnaTranscription {

    String transcribe(String dnaStrand) {
//    char charsOfDNA = dnaStrand.charAt(0);
    StringBuilder DNAStrand = new StringBuilder(dnaStrand);
    String RNA ="";


    for (int i = 0; i<dnaStrand.length(); i++){
        if (DNAStrand.charAt(i) == 'G'){
             RNA = RNA + "C";
        }else if (DNAStrand.charAt(i) == 'C'){
            RNA = RNA + "G";
        }else if (DNAStrand.charAt(i) == 'T'){
            RNA = RNA + "A";
        }else if (DNAStrand.charAt(i) == 'A'){
            RNA = RNA + "U";
        }
//        return DNAStrand.toString();
//          return RNA;
    }

//        return DNAStrand.toString();
        return RNA;

}

}
