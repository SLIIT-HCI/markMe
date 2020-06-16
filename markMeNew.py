#This is an attempt to manually evaluate the answer script by hard coding the marking steps

# Ask the user to enter the names of files to compare
fname1 = input("Enter the first filename: ")
# Open file for reading in text mode (default mode)
f1 = open(fname1)
file = f1.read()
lines = file.strip().splitlines()
count = 0;
i = len(lines)

for x in range(0,i):
    if lines[x].find("private String CentreName;")>0:
        count += 0.5
    if lines[x].find("private String type;" )>0:
        count += 0.5
    if lines[x].find("private String address")>0:
        count += 0.5

#------------------------------------------------------------------------1.5

    if lines[x].find("this.CentreName = CentreName;")>0:
        count += 0.66
    if lines[x].find("this.type = type;" )>0:
        count += 0.66
    if lines[x].find("this.address = address")>0:
        count += 0.66

#------------------------------------------------------------------------1.98

    if lines[x].find('System.out.println("Centre Name : " + CentreName);')>0:
        count += 0.5
    if lines[x].find('System.out.println("Type        : " + type);' )>0:
        count += 0.5
    if lines[x].find('System.out.println("Address     : " + address);')>0:
        count += 0.5

#------------------------------------------------------------------------1.5

    
    if lines[x].find("private int noOfparkingSlots;")>0:
        count += 0.5
    if lines[x].find("private int size;")>0:
        count += 0.5
    if lines[x].find("private String loyaltyCard")>0:
        count += 0.5

#------------------------------------------------------------------------1.5

    if lines[x].find('super(CentreName, "SuperMarket", address);')>0:
        count += 0.5

#------------------------------------------------------------------------0.5

    if lines[x].find("this.noOfparkingSlots = noOfparkingSlots;")>0:
        count += 0.5
    if lines[x].find("this.size = size;")>0:
        count += 0.5
    if lines[x].find("this.loyaltyCard = loyaltyCard;")>0:
        count += 0.5

#------------------------------------------------------------------------1.5

    if lines[x].find("super.Display();")>0:
        count += 0.5

#------------------------------------------------------------------------0.5

    if lines[x].find('System.out.println("No of Parking slots   " + noOfparkingSlots);')>0:
        count += 0.33
    if lines[x].find('System.out.println("size                  " + size);')>0:
        count += 0.33
    if lines[x].find('System.out.println("Loyalty Card          " + loyaltyCard);')>0:
        count += 0.33

#------------------------------------------------------------------------0.99
        
    if lines[x].find("private boolean InWard;")>0:
        count += 0.5
    if lines[x].find("private boolean opd;")>0:
        count += 0.5
    if lines[x].find("private boolean surgery;")>0:
        count += 0.5

#------------------------------------------------------------------------1.5

    if lines[x].find('super(CentreName, "Medical", address);')>0:
        count += 0.5

#------------------------------------------------------------------------0.5

    if lines[x].find("this.InWard = InWard;")>0:
        count += 0.5
    if lines[x].find("this.opd = opd;")>0:
        count += 0.5
    if lines[x].find("this.surgery = surgery;")>0:
        count += 0.5

#------------------------------------------------------------------------1.5


    if lines[x].find("super.Display();")>0:
        count += 0.5

#------------------------------------------------------------------------0.5

    if lines[x].find('System.out.println("System.out.println("InWard                 " + InWard);')>0:
        count += 0.33
    if lines[x].find('System.out.println("System.out.println("Opd                    " + opd);')>0:
        count += 0.33
    if lines[x].find('System.out.println("System.out.println("Surgery                " + surgery);')>0:
        count += 0.33

#------------------------------------------------------------------------0.99

    if lines[x].find("ArrayList<Centre> marr = new ArrayList<Centre>();")>0:
        count += 0.5

#------------------------------------------------------------------------0.5

    if lines[x].find("marr.add")>0:
        count += 0.25
    if lines[x].find("marr.add")>0:
        count += 0.25
    if lines[x].find("marr.add")>0:
        count += 0.25
    if lines[x].find("marr.add")>0:
        count += 0.25

#------------------------------------------------------------------------1


    if lines[x].find('marr.add(new MedicalCentre("Asiri", "Nawala", true, true, true)); ')>0:
        count += 0.5
    if lines[x].find('marr.add(new MedicalCentre("Sanhinda", "Kandy", false, true, false));')>0:
        count += 0.5
    if lines[x].find('marr.add(new Supermarket("Keels Borella", "Borella", 30, 10000, "Nexus"));')>0:
        count += 0.5
    if lines[x].find('marr.add(new Supermarket("Cargills Kandy", "Kandy", 20, 7000, "Cargills"));')>0:
        count += 0.5

#------------------------------------------------------------------------2

    if lines[x].find("for (Centre cent : marr)")>0:
        count += 1   
#------------------------------------------------------------------------1

    

    

    

print(count);
        
    
    


