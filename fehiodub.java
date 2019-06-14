class fehiodub {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
        System.out.println(cigarParty(80, false));
        System.out.println(cigarParty(30, true));

    }

    public static boolean cigarParty(int cigars, boolean isWeekend){
        // Your code goes here 
        if (isWeekend)
        {
            if(cigars >= 40)
            {
                return true; 
            }
        }
        if (!(isWeekend))
        {
            if (cigars >= 40 && cigars <= 60)
            {
                return true; 
            }
        }
        return false;
    }
}
