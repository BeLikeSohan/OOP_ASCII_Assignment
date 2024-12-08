class Code {
    public static final char[][] asciiArt = {
            "        #############   ############### ######################                         ########         #########  \n"
                    .toCharArray(),
            "     ################ ########################################                        ########         ##########  \n"
                    .toCharArray(),
            "   ###########################################################                       ########         ###########  \n"
                    .toCharArray(),
            "  ##########################     #############################                      ########         ############  \n"
                    .toCharArray(),
            " #######       #############              #######       ######                     ########         ###### ######  \n"
                    .toCharArray(),
            "#######              #######              #######                                 ########         ######  ######  \n"
                    .toCharArray(),
            "#######               #########           #################                      ########         ######   ######  \n"
                    .toCharArray(),
            "#######                #############      #################    ---------------  ##############   ##################\n"
                    .toCharArray(),
            "#######                  #############    #################    -#############- ################# ##################\n"
                    .toCharArray(),
            "#######                     ###########   #################    --------------- ####################################\n"
                    .toCharArray(),
            "#######                          #######  #######                              #######     #######         ######  \n"
                    .toCharArray(),
            " #######       ######            #######  #######       ######                 #######     #######         ######  \n"
                    .toCharArray(),
            "  ##########################     #############################                 ###################         ######  \n"
                    .toCharArray(),
            "   ###########################################################                  #################        ##########\n"
                    .toCharArray(),
            "     ################################## ######################                    #############          ##########\n"
                    .toCharArray(),
            "        ############# ###############   ######################                      #########            ##########\n"
                    .toCharArray()
    };

    static String names = "SHOHAN MARJAN SANTA SABIR TRINA ALIM ALIF ALVI DIPTO JIHAD KONGKONA TITHI NIRBOB SABIT SHARIF TANSIR ARIFUL SRABON ANIK SAMIA SNINGDHO SAYEM ANONNYA ARIFUL DIPJOY RAHAT EMON FAHIM MAWA NOYON NAIMUL RAMJAN HRIDOY NAHIDA NEAMAT NISHA PROTTOY PHAIRUSE RAKIB AKIB MASUM RIDI NAFISA SAJIDUL SHAKIL TONNI VASKAR YEYA ZITU";

    public static void main(String[] args) {
        int currentCharacterIndex = 0;
        int maxLength = names.length();

        System.out.print("\n\n\n");
        for (char[] row : asciiArt) {
            for (char c : row) {
                if (currentCharacterIndex >= maxLength) {
                    currentCharacterIndex = 0;
                }

                if (c == '#') {
                    System.out.print(names.charAt(currentCharacterIndex));
                    currentCharacterIndex++;
                } else {
                    System.out.print(c);
                }
            }
        }
        System.out.print("\n\n\n");
    }
}
