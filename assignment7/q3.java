
class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
}

class BNode {
    Country info;
    BNode left;
    BNode right;

    public BNode(Country country) {
        this.info = country;
        this.left = null;
        this.right = null;
    }
}

class BST {
    BNode root;

    public BST() {
        this.root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode root, Country country) {
        if (root == null) {
            root = new BNode(country);
            return root;
        }

        if (country.name.compareTo(root.info.name) < 0)
            root.left = insertRec(root.left, country);
        else if (country.name.compareTo(root.info.name) > 0)
            root.right = insertRec(root.right, country);

        return root;
    }
}

public class q3 {
    public static void main(String[] args) {
        BST bst = new BST();
        
      
        Country europe = new Country("Europe", 931000);
        Country Korea = new Country("S.Korea",440100);
        Country india = new Country("India", 13930000);
        Country brazil = new Country("Brazil", 713000);


        bst.insert(europe);
        bst.insert(Korea);
        bst.insert(india);
        bst.insert(brazil);
    }
}


