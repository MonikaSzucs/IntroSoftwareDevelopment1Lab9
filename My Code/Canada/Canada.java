
/**
 * Write a description of class Canada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Canada
{
    // instance variables - replace the example below with your own
    public static final int ON = 0;
    public static final int QC = 1;
    public static final int NS = 2;
    public static final int NB = 3;
    public static final int MB = 4;
    public static final int BC = 5;
    public static final int PE = 6;
    public static final int SK = 7;
    public static final int AB = 8;
    public static final int NL = 9;
    public static final int YT = 10;
    public static final int NU = 11;
    public static final int NT = 12;

    public static final int NAME_OF_PROVINCE = 0;
    public static final int NAME_OF_CAPITAL_CITY = 1;
    public static final int NAME_OF_BIGGEST_CITY = 2;

    private String[][] provinces;

    /**
     * Constructor for objects of class Canada
     */
    public Canada()
    {
        provinces = new String[13][3]; 

        provinces[ON][NAME_OF_PROVINCE] = "ontario";
        provinces[ON][NAME_OF_CAPITAL_CITY] = "toronto";
        provinces[ON][NAME_OF_BIGGEST_CITY] = "toronto";

        provinces[QC][NAME_OF_PROVINCE] = "quebec";
        provinces[QC][NAME_OF_CAPITAL_CITY] = "quebec city";
        provinces[QC][NAME_OF_BIGGEST_CITY] = "montreal";

        provinces[NS][NAME_OF_PROVINCE] = "nova scotia";
        provinces[NS][NAME_OF_CAPITAL_CITY] = "halifax";
        provinces[NS][NAME_OF_BIGGEST_CITY] = "halifax";

        provinces[NB][NAME_OF_PROVINCE] = "new brunswick";
        provinces[NB][NAME_OF_CAPITAL_CITY] = "fredericton";
        provinces[NB][NAME_OF_BIGGEST_CITY] = "saint john";

        provinces[MB][NAME_OF_PROVINCE] = "manitoba";
        provinces[MB][NAME_OF_CAPITAL_CITY] = "winnipeg";
        provinces[MB][NAME_OF_BIGGEST_CITY] = "winnipeg";

        provinces[BC][NAME_OF_PROVINCE] = "british columbia";
        provinces[BC][NAME_OF_CAPITAL_CITY] = "victoria";
        provinces[BC][NAME_OF_BIGGEST_CITY] = "vancouver";

        provinces[PE][NAME_OF_PROVINCE] = "prince edward island";
        provinces[PE][NAME_OF_CAPITAL_CITY] = "charlottetown";
        provinces[PE][NAME_OF_BIGGEST_CITY] = "charlottetown";

        provinces[SK][NAME_OF_PROVINCE] = "saskatchewan";
        provinces[SK][NAME_OF_CAPITAL_CITY] = "regina";
        provinces[SK][NAME_OF_BIGGEST_CITY] = "saskatoon";

        provinces[AB][NAME_OF_PROVINCE] = "alberta";
        provinces[AB][NAME_OF_CAPITAL_CITY] = "edmonton";
        provinces[AB][NAME_OF_BIGGEST_CITY] = "calgary";

        provinces[NL][NAME_OF_PROVINCE] = "newfoundland and labrador";
        provinces[NL][NAME_OF_CAPITAL_CITY] = "st johns";
        provinces[NL][NAME_OF_BIGGEST_CITY] = "st johns";

        provinces[YT][NAME_OF_PROVINCE] = "yukon";
        provinces[YT][NAME_OF_CAPITAL_CITY] = "whitehorse";
        provinces[YT][NAME_OF_BIGGEST_CITY] = "whitehorse";

        provinces[NU][NAME_OF_PROVINCE] = "nunavut";
        provinces[NU][NAME_OF_CAPITAL_CITY] = "iqaluit";
        provinces[NU][NAME_OF_BIGGEST_CITY] = "iqaluit";

        provinces[NT][NAME_OF_PROVINCE] = "Northwest Territories";
        provinces[NT][NAME_OF_CAPITAL_CITY] = "yellowknife";
        provinces[NT][NAME_OF_BIGGEST_CITY] = "yellowknife";
    }

    /**
     * 
     *
     * @param   province the user typed in
     * @return  the name of the capital city or null
     * @return  null if cannot find any provinces matched
     */
    public String getCapitalCityOf(String province)
    {

        if((province ==null) || (province.equals(""))){
            throw new IllegalArgumentException("cannot be empty");
        }

        for(int i =0;i<provinces.length;i++){
            if  ( 
            provinces[i] !=null &&
            provinces[i][NAME_OF_PROVINCE] !=null &&
            provinces[i][NAME_OF_PROVINCE].toLowerCase().equals(province.toLowerCase())
            )
            {
                return provinces[i][NAME_OF_CAPITAL_CITY];
            }
        }

        return null;

    }
    
    /**
     * 
     *
     * @param   province the user typed in
     * @return  the name of the biggest city
     * @return  null if cannot find any provinces matched
     */
    public String getLargestCityOf(String province)
    {

        if((province ==null) || (province.equals(""))){
            throw new IllegalArgumentException("cannot be empty");
        }

        for(int i =0;i<provinces.length;i++){
            if  ( 
            provinces[i] !=null &&
            provinces[i][NAME_OF_PROVINCE] !=null &&
            provinces[i][NAME_OF_PROVINCE].toLowerCase().equals(province.toLowerCase())
            )
            {
                return provinces[i][NAME_OF_BIGGEST_CITY];
            }
        }

        return null;

    }
    
    /**
     * 
     *
     * @param   city the user typed in
     * @return  the name of the province
     * @return  null if cannot find any city matched
     */
    
    public String getProvinceWhoseCapitalIs(String city)
    {

        if((city ==null) || (city.equals(""))){
            throw new IllegalArgumentException("cannot be empty");
        }

        for(int i =0;i<provinces.length;i++){
            if  ( 
            provinces[i] !=null &&
            provinces[i][NAME_OF_CAPITAL_CITY] !=null &&
            provinces[i][NAME_OF_CAPITAL_CITY].toLowerCase().equals(city.toLowerCase())
            )
            {
                return provinces[i][NAME_OF_PROVINCE];
            }
        }

        return null;

    }
    
    /**
     * 
     * @continue  if the province is null or empty
     * Printing out the correct message depening on the province and city names found.
     */
    public void displayAllProvinceInfo(){

        for(int i = 0; i<provinces.length; i++){

            if  (
            (provinces[i][NAME_OF_PROVINCE] == null || provinces[i][NAME_OF_PROVINCE].equals("")) &&
            (provinces[i][NAME_OF_CAPITAL_CITY] == null || provinces[i][NAME_OF_CAPITAL_CITY].equals("")) &&
            (provinces[i][NAME_OF_BIGGEST_CITY] == null || provinces[i][NAME_OF_BIGGEST_CITY].equals(""))
            )
            {

                continue;
            }

            if(provinces[i][NAME_OF_CAPITAL_CITY].toLowerCase() != provinces[i][NAME_OF_BIGGEST_CITY]){
                int spacePos = 0;
                if(provinces[i][NAME_OF_CAPITAL_CITY].contains(" ")){
                    spacePos = provinces[i][NAME_OF_CAPITAL_CITY].indexOf(' ');
                    System.out.println("The capital city of "+ provinces[i][NAME_OF_PROVINCE].toUpperCase() + " is " + provinces[i][NAME_OF_CAPITAL_CITY].substring(0, 1).toUpperCase() + provinces[i][NAME_OF_CAPITAL_CITY].substring(1,spacePos) + provinces[i][NAME_OF_CAPITAL_CITY].substring(spacePos,spacePos+2).toUpperCase() + provinces[i][NAME_OF_CAPITAL_CITY].substring(spacePos+2) + ", but the largest city is " + provinces[i][NAME_OF_BIGGEST_CITY].substring(0, 1).toUpperCase() + provinces[i][NAME_OF_BIGGEST_CITY].substring(1));
                }
                else if(provinces[i][NAME_OF_BIGGEST_CITY].contains(" ")){
                    spacePos = provinces[i][NAME_OF_BIGGEST_CITY].indexOf(' ');
                    System.out.println("The capital city of "+ provinces[i][NAME_OF_PROVINCE].toUpperCase() + " is " + provinces[i][NAME_OF_CAPITAL_CITY].substring(0, 1).toUpperCase() + provinces[i][NAME_OF_CAPITAL_CITY].substring(1) + ", but the largest city is " + provinces[i][NAME_OF_BIGGEST_CITY].substring(0, 1).toUpperCase() + provinces[i][NAME_OF_BIGGEST_CITY].substring(1,spacePos) + provinces[i][NAME_OF_BIGGEST_CITY].substring(spacePos,spacePos+2).toUpperCase() + provinces[i][NAME_OF_BIGGEST_CITY].substring(spacePos+2));
                }
                else {
                    System.out.println("The capital city of "+ provinces[i][NAME_OF_PROVINCE].toUpperCase() + " is " + provinces[i][NAME_OF_CAPITAL_CITY].substring(0, 1).toUpperCase() + provinces[i][NAME_OF_CAPITAL_CITY].substring(1)+", but the largest city is " + provinces[i][NAME_OF_BIGGEST_CITY].substring(0, 1).toUpperCase() + provinces[i][NAME_OF_BIGGEST_CITY].substring(1));
                }
            }
            else {
                int spacePos = 0;
                if(provinces[i][NAME_OF_CAPITAL_CITY].contains(" ")){
                    spacePos = provinces[i][NAME_OF_CAPITAL_CITY].indexOf(' ');
                    System.out.println("The capital city of "+ provinces[i][NAME_OF_PROVINCE].toUpperCase() + " is " + provinces[i][NAME_OF_CAPITAL_CITY].substring(0, 1).toUpperCase() + provinces[i][NAME_OF_CAPITAL_CITY].substring(1,spacePos) + provinces[i][NAME_OF_CAPITAL_CITY].substring(spacePos,spacePos+2).toUpperCase() + provinces[i][NAME_OF_CAPITAL_CITY].substring(spacePos+2) +", and it is also the largest city.");
                }
                else{
                    System.out.println("The capital city of "+ provinces[i][NAME_OF_PROVINCE].toUpperCase() + " is " + provinces[i][NAME_OF_CAPITAL_CITY].substring(0, 1).toUpperCase() + provinces[i][NAME_OF_CAPITAL_CITY].substring(1)+", and it is also the largest city.");
                }
            }

        }
    }
}
