package oca.project;

import java.util.ArrayList;



/**
 * Main class that creates all employees and specifies their managers
 */
public class OCAProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        CEO jamesMint = new CEO(110000.00);
        jamesMint.setFirstName("James");
        jamesMint.setLastName("Mint");
        jamesMint.setDateOfBirth("28/12/1977");
        jamesMint.setDateStarted("10/01/2010");
        jamesMint.setTimePeriod(TimePeriods.MONTHLY);
          
        AdministrationManager billJohns = new AdministrationManager(jamesMint);
        billJohns.setFirstName("Bill");
        billJohns.setLastName("Johns");
        billJohns.setDateOfBirth("13/04/1981");
        billJohns.setDateStarted("10/05/2012");
        billJohns.setTimePeriod(TimePeriods.MONTHLY);
        jamesMint.addSubordinate(billJohns);
       
        BranchManager kateHudson = new BranchManager(billJohns);
        kateHudson.setFirstName("Kate");
        kateHudson.setLastName("Hudson");
        kateHudson.setDateOfBirth("13/07/1981");
        kateHudson.setDateStarted("11/03/2013");
        kateHudson.setTimePeriod(TimePeriods.MONTHLY);
        billJohns.addSubordinate(kateHudson);
        
        BranchManager scarletGreen = new BranchManager(billJohns);
        scarletGreen.setFirstName("Scarlet");
        scarletGreen.setLastName("Green");
        scarletGreen.setDateOfBirth("20/03/1980");
        scarletGreen.setDateStarted("10/05/2013");
        scarletGreen.setTimePeriod(TimePeriods.MONTHLY);
        billJohns.addSubordinate(scarletGreen);
        
        BranchManager amandaGreen = new BranchManager(billJohns);
        amandaGreen.setFirstName("Amanda");
        amandaGreen.setLastName("Green");
        amandaGreen.setDateOfBirth("5/04/1979");
        amandaGreen.setDateStarted("14/10/2014");
        amandaGreen.setTimePeriod(TimePeriods.MONTHLY);
        billJohns.addSubordinate(amandaGreen);
        
        FinancialAdministrator ericWhite = new FinancialAdministrator(jamesMint);
        ericWhite.setFirstName("Eric");
        ericWhite.setLastName("White");
        ericWhite.setDateOfBirth("21/05/1984");
        ericWhite.setDateStarted("10/04/2011");
        ericWhite.setTimePeriod(TimePeriods.FORTNIGHTLY);
        jamesMint.addSubordinate(ericWhite);
        
        HROfficier juliaSmith = new HROfficier(jamesMint);
        juliaSmith.setFirstName("Julia");
        juliaSmith.setLastName("Smith");
        juliaSmith.setDateOfBirth("17/02/1973");
        juliaSmith.setDateStarted("13/06/2010");
        juliaSmith.setTimePeriod(TimePeriods.MONTHLY);
        jamesMint.addSubordinate(juliaSmith);
       
        ProjectManager victoriaBell = new ProjectManager(amandaGreen);
        victoriaBell.setFirstName("Victoria");
        victoriaBell.setLastName("Bell");
        victoriaBell.setDateOfBirth("11/01/1978");
        victoriaBell.setDateStarted("30/04/2013");
        victoriaBell.setTimePeriod(TimePeriods.FORTNIGHTLY);
        amandaGreen.addSubordinate(victoriaBell);
        
        SeniorProgramDeveloper johnNorton = new SeniorProgramDeveloper(victoriaBell);
        johnNorton.setFirstName("John");
        johnNorton.setLastName("Norton");
        johnNorton.setDateOfBirth("17/07/1980");
        johnNorton.setDateStarted("10/09/2010");
        johnNorton.setTimePeriod(TimePeriods.MONTHLY);
        victoriaBell.addSubordinate(johnNorton);
        
        ProgramDeveloper alexDillon = new ProgramDeveloper(johnNorton);
        alexDillon.setFirstName("Alex");
        alexDillon.setLastName("Dillon");
        alexDillon.setDateOfBirth("10/03/1989");
        alexDillon.setDateStarted("14/09/2014");
        alexDillon.setTimePeriod(TimePeriods.FORTNIGHTLY);
        johnNorton.addSubordinate(alexDillon);
        
        ProjectManager charlotteHond = new ProjectManager(kateHudson);
        charlotteHond.setFirstName("Charlotte");
        charlotteHond.setLastName("Hond");
        charlotteHond.setDateOfBirth("1/07/1988");
        charlotteHond.setDateStarted("28/02/2012");
        charlotteHond.setTimePeriod(TimePeriods.FORTNIGHTLY);
        kateHudson.addSubordinate(charlotteHond);
        
        ProjectManager christineBennet = new ProjectManager(scarletGreen);
        christineBennet.setFirstName("Christine");
        christineBennet.setLastName("Bennet");
        christineBennet.setDateOfBirth("16/06/1982");
        christineBennet.setDateStarted("11/06/2011");
        christineBennet.setTimePeriod(TimePeriods.FORTNIGHTLY);
        scarletGreen.addSubordinate(christineBennet);
        
        ProgramDeveloper davidGalloway = new ProgramDeveloper(christineBennet);
        davidGalloway.setFirstName("David");
        davidGalloway.setLastName("Galloway");
        davidGalloway.setDateOfBirth("6/12/1981");
        davidGalloway.setDateStarted("5/11/2013");
        davidGalloway.setTimePeriod(TimePeriods.MONTHLY);
        christineBennet.addSubordinate(davidGalloway);
        
        Receptionist peterGordon = new Receptionist(juliaSmith);
        peterGordon.setFirstName("Peter");
        peterGordon.setLastName("Gordon");
        peterGordon.setDateOfBirth("30/09/1983");
        peterGordon.setDateStarted("10/05/2010");
        peterGordon.setTimePeriod(TimePeriods.FORTNIGHTLY);
        juliaSmith.addSubordinate(peterGordon);
        
        SalesManager michaelBrown = new SalesManager(jamesMint);
        michaelBrown.setFirstName("Michael");
        michaelBrown.setLastName("Brown");
        michaelBrown.setDateOfBirth("25/12/1985");
        michaelBrown.setDateStarted("21/07/2012");
        michaelBrown.setTimePeriod(TimePeriods.FORTNIGHTLY);
        jamesMint.addSubordinate(michaelBrown);
        
        SalesConsultant helenChan = new SalesConsultant(michaelBrown);
        helenChan.setFirstName("Helen");
        helenChan.setLastName("Chan");
        helenChan.setDateOfBirth("11/01/1991");
        helenChan.setDateStarted("20/05/2011");
        michaelBrown.addSubordinate(helenChan);
        
        SeniorProgramDeveloper ashleySimpson = new SeniorProgramDeveloper(charlotteHond);
        ashleySimpson.setFirstName("Ashley");
        ashleySimpson.setLastName("Simpson");
        ashleySimpson.setDateOfBirth("12/05/1984");
        ashleySimpson.setDateStarted("15/06/2010");
        ashleySimpson.setTimePeriod(TimePeriods.MONTHLY);
        charlotteHond.addSubordinate(ashleySimpson);
        
        ProgramDeveloper andrewSampson = new ProgramDeveloper(ashleySimpson);
        andrewSampson.setFirstName("Andrew");
        andrewSampson.setLastName("Sampson");
        andrewSampson.setDateOfBirth("9/04/1984");
        andrewSampson.setDateStarted("4/07/2010");
        andrewSampson.setTimePeriod(TimePeriods.FORTNIGHTLY);
        ashleySimpson.addSubordinate(andrewSampson);
        
        SystemAdministrator andrewBlack = new SystemAdministrator(amandaGreen);
        andrewBlack.setFirstName("Andrew");
        andrewBlack.setLastName("Black");
        andrewBlack.setDateOfBirth("15/04/1976");
        andrewBlack.setDateStarted("4/05/2012");
        andrewBlack.setTimePeriod(TimePeriods.MONTHLY);
        amandaGreen.addSubordinate(andrewBlack);
        
        SystemAdministrator joanneDowman = new SystemAdministrator(kateHudson);
        joanneDowman.setFirstName("Joanne");
        joanneDowman.setLastName("Dowman");
        joanneDowman.setDateOfBirth("13/12/1980");
        joanneDowman.setDateStarted("7/07/2014");
        joanneDowman.setTimePeriod(TimePeriods.FORTNIGHTLY);
        kateHudson.addSubordinate(joanneDowman);
        
        SystemAdministrator michaelPerry = new SystemAdministrator(scarletGreen);
        michaelPerry.setFirstName("Michael");
        michaelPerry.setLastName("Perry");
        michaelPerry.setDateOfBirth("12/11/1977");
        michaelPerry.setDateStarted("1/03/2014");
        michaelPerry.setTimePeriod(TimePeriods.FORTNIGHTLY);
        scarletGreen.addSubordinate(michaelPerry);
        
        SystemAnalyst andrewBlank = new SystemAnalyst(victoriaBell);
        andrewBlank.setFirstName("Andrew");
        andrewBlank.setLastName("Blank");
        andrewBlank.setDateOfBirth("15/09/1981");
        andrewBlank.setDateStarted("19/08/2014");
        andrewBlank.setTimePeriod(TimePeriods.MONTHLY);
        victoriaBell.addSubordinate(andrewBlank);
        
        SystemAnalyst carolWhite = new SystemAnalyst(charlotteHond);
        carolWhite.setFirstName("Carol");
        carolWhite.setLastName("White");
        carolWhite.setDateOfBirth("20/10/1975");
        carolWhite.setDateStarted("10/01/2014");
        carolWhite.setTimePeriod(TimePeriods.MONTHLY);
        charlotteHond.addSubordinate(carolWhite);
        
        SystemAnalyst bradTurner = new SystemAnalyst(christineBennet);
        bradTurner.setFirstName("Brad");
        bradTurner.setLastName("Turner");
        bradTurner.setDateOfBirth("22/11/1988");
        bradTurner.setDateStarted("26/05/2014");
        bradTurner.setTimePeriod(TimePeriods.MONTHLY);
        christineBennet.addSubordinate(bradTurner);
        
        Tester jamesCarol = new Tester(victoriaBell);
        jamesCarol.setFirstName("James");
        jamesCarol.setLastName("Carol");
        jamesCarol.setDateOfBirth("24/03/1978");
        jamesCarol.setDateStarted("6/09/2013");
        victoriaBell.addSubordinate(jamesCarol);
        
        Tester elenaTang = new Tester(charlotteHond);
        elenaTang.setFirstName("Elena");
        elenaTang.setLastName("Tang");
        elenaTang.setDateOfBirth("11/02/1969");
        elenaTang.setDateStarted("7/08/2013");
        charlotteHond.addSubordinate(elenaTang);
        
        Tester tessaGreen = new Tester(charlotteHond);
        tessaGreen.setFirstName("Tessa");
        tessaGreen.setLastName("Green");
        tessaGreen.setDateOfBirth("31/10/1985");
        tessaGreen.setDateStarted("8/07/2013");
        charlotteHond.addSubordinate(tessaGreen);
        
        Tester davidChand = new Tester(christineBennet);
        davidChand.setFirstName("David");
        davidChand.setLastName("Chand");
        davidChand.setDateOfBirth("11/04/1973");
        davidChand.setDateStarted("9/06/2014");
        christineBennet.addSubordinate(davidChand);
        
        ArrayList<Person> personList1 = new ArrayList<Person>();
        personList1.add(jamesMint);
        personList1.add(billJohns);
        personList1.add(kateHudson);
        personList1.add(scarletGreen);
        personList1.add(amandaGreen);
        personList1.add(ericWhite);
        personList1.add(juliaSmith);
        personList1.add(alexDillon);
        personList1.add(andrewSampson);
        personList1.add(davidGalloway);
        personList1.add(victoriaBell);
        personList1.add(charlotteHond);
        personList1.add(christineBennet);
        personList1.add(peterGordon);
        personList1.add(helenChan);
        personList1.add(michaelBrown);
        personList1.add(johnNorton);
        personList1.add(ashleySimpson);
        personList1.add(andrewBlack);
        personList1.add(joanneDowman);
        personList1.add(michaelPerry);
        personList1.add(andrewBlank);
        personList1.add(carolWhite);
        personList1.add(bradTurner);
        personList1.add(jamesCarol);
        personList1.add(elenaTang);
        personList1.add(tessaGreen);
        personList1.add(davidChand);
        
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        mainForm.setList(personList1);
    }
    
}
