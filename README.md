<h1>Work History and Notes</h1>


<h3>Part C: Customized HTML</h3>
<p>Prompt:  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.</p>
<ul>
    <li>Modified 'mainscreen.html'
        <ul>
        <li>line 14, changed contents of 'title' tag for Shop Name Requirement</li>
        <li>line 19, changed contents of 'h1' tag for Shop Name Requirement</li>
        <li>line 21, changed contents of 'h2' tag for Parts Name Requirement</li>
        <li>line 25, changed 'value' attribute of 'input' tag for Parts Name Requirement</li>
        <li>lines 30-31, changed contents of 'a' tags for Parts Name Requirement</li>
        <li>line 53, changed contents of 'h2' tag for Product Name Requirement</li>
        <li>line 57, changed 'value' attribute of 'input' tag for Product Name Requirement</li>
        <li>line 67, changed contents of 'a' tag for Product Name Requirement</li>
        </ul>
    </li><br/>
    <li>Modified 'InhousePartForm.html'
        <ul>
            <li>line 6, changed contents of 'title' tag for Parts Name Requirement</li>
            <li>line 10, changed contents of 'h1' tag for Parts Name Requirement</li>
        </ul>
    </li><br/>
    <li>Modified 'OutsourcedPartForm.html'
        <ul>
            <li>line 6, changed contents of 'title' tag for Parts Name Requirement</li>
            <li>line 10, changed contents of 'h1' tag for Parts Name Requirement</li>
        </ul>
    </li><br/>
    <li>Modified 'confirmationaddpart.html'
        <ul>
            <li>line 10, changed contents of 'h1' tag for Parts name Requirement</li>
        </ul>
    </li><br/>
    <li>Modified 'confirmationdeletepart.html'
        <ul>
            <li>line 10, changed contents of 'h1' tag for Parts name Requirement</li>
        </ul>
    </li><br/>
    <li>Modified 'confirmationassocpart.html'
        <ul>
            <li>line 10, changed contents of 'h1' tag for Parts name Requirement</li>
        </ul>
    </li><br/>
    <li>Modified 'productForm.html'
        <ul>
            <li>line 7, changed contents of 'title' tag for Product name Requirement</li>
            <li>line 12, changed contents of 'h1' tag for Product name Requirement</li>
            <li>line 35, changed contents of 'h2' tag for Parts name Requirement</li>
            <li>line 54, changed contents of 'h2' tag for Parts name Requirement</li>
        </ul>
    </li><br/>
    <li>Modified 'saveproductscreen.html'
        <ul>
            <li>line 5, changed contents of 'title' tag for Product name Requirement</li>
            <li>line 8, changed contents of 'p' tag for Product name Requirement</li>
        </ul>
    </li><br/>
    <li>Modified 'confirmationaddproduct.html'
        <ul>
            <li>line 10, changed contents of 'h1' tag for Product name Requirement</li>
        </ul>
    </li><br/>
    <li>Modified 'confirmationdeleteproduct.html'
        <ul>
            <li>line 10, changed contents of 'h1' tag for Product name Requirement</li>
        </ul>
    </li><br/>
    <li>Modified 'navigateerror.html'
        <ul>
            <li>line 8, changed contents of 'p' tag for Product name Requirement and Parts Name Requirement</li>
        </ul>
    </li>
</ul>

<h3>Part D: About Page</h3>
<p>Prompt: Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.</p>
<ul>
    <li>Created 'about.html'
        <ul>
        <li>all lines, Wrote and formatted, using html, the information about the company</li>
        <li>lines 38-39, used thymeleaf 'th:href' attribute in 'a' tag to link back to the main screen</li>
        </ul>
    </li><br/>
    <li>Created 'AboutPageController.java'
    <ul>
        <li>line 3, imported the 'Controller' stereotype from springframework
        </li>
        <li>line 4, imported the 'GetMapping' web annotation from springframework
        </li>
        <li>line 6, annotated the class with the 'Controller' annotation
        </li>
        <li>line 8, annotated the 'showAbout' method with the 'GetMapping' annotation with "/about" as a parameter
        </li>
        <li>line 11, returned the String 'about', the name of the html file to be directed to
        </li>
    </ul>
    </li><br/>
    <li>Modified 'mainscreen.html'
    <ul>
        <li>line 89, added an 'a' tag with the thymeleaf 'th:href' attribute to link to the about page
        </li>
    </ul>
    </li>
</ul>

<h3>Part E: Sample Inventory</h3>
<p>Prompt: Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.</p>
<ul>
    <li>Modified 'BootStrapData.java'
        <ul>
        <li>lines 34-40, added an 'InhousePartRepository' object into the class as a private final field, then added a 'InhousePartRepository' parameter to the class's cunstructor, then assigned it to the field using the 'this' operator</li>
        <li>lines 46-110, used the private repository fields ('inhousePartRepository', 'outsourcedPartRepository', and 'productRepository') combined with the imported domain classes ('InhousePart', 'OutsourcedPart', and 'Product') to create and store inhouse parts, outsourced parts, and products in the data base. Used a 'findByName' method to search each repository for the objects in the sample inventory and make sure no duplicates are added when the application is run multiple times</li>
        </ul>
    </li><br/>
    <li>Modified 'OutsourcedPartRepository.java'
        <ul>
        <li>line 5, imported 'java.util.List'</li>
        <li>line 14, used Spring Data's mini Domain Specific Language to make a self implementing 'findByName' method</li>
        </ul>
    </li><br/>
    <li>Modified 'InhousePartRepository.java'
        <ul>
        <li>line 7, imported 'java.util.List'</li>
        <li>line 17, used Spring Data's mini Domain Specific Language to make a self implementing 'findByName' method</li>
        </ul>
    </li><br/>
    <li>Modified 'ProductRepository.java'
        <ul>
        <li>line 19, used Spring Data's mini Domain Specific Language to make a self implementing 'findByName' method</li>
        </ul>
    </li>
</ul>

<h3>Part F: "Buy Now" Button</h3>
<ul>
    <li>File name, line numbers
        <ul><li>Changes changes</li></ul>
    </li>
</ul>

<h3>Part G: Max and Min Inventory</h3>
<ul>
    <li>File name, line numbers
        <ul><li>Changes changes</li></ul>
    </li>
</ul>

<h3>Part H: Inventory Validation</h3>
<ul>
    <li>File name, line numbers
        <ul><li>Changes changes</li></ul>
    </li>
</ul>

<h3>Part I: Unit Tests</h3>
<ul>
    <li>File name, line numbers
        <ul><li>Changes changes</li></ul>
    </li>
</ul>

<h3>Part J: Clean Up</h3>
<ul>
    <li>File name, line numbers
        <ul><li>Changes changes</li></ul>
    </li>
</ul>
