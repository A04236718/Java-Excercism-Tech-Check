class RnaTranscription {

    String transcribe(String dnaStrand) {
//    char charsOfDNA = dnaStrand.charAt(0);
    StringBuilder DNAStrand = new StringBuilder(dnaStrand);


    for (int i = 0; i<DNAStrand.length(); i++){
        if (DNAStrand.charAt(i) == 'G'){
            DNAStrand.setCharAt(i, 'C');
        }else if (DNAStrand.charAt(i) == 'C'){
            DNAStrand.setCharAt(i,'G' );
        }else if (DNAStrand.charAt(i) == 'T'){
            DNAStrand.setCharAt(i, 'A');
        }else if (DNAStrand.charAt(i) == 'A'){
            DNAStrand.setCharAt(i, 'U');
        }
        return DNAStrand.toString();
    }
        System.out.println(DNAStrand);
        return DNAStrand.toString();

}

}
