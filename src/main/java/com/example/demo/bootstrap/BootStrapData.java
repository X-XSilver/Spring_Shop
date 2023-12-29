package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        OutsourcedPart coverFrontAxle = new OutsourcedPart();
        coverFrontAxle.setCompanyName("Small Tractor Co.");
        coverFrontAxle.setName("Cover Front Axle");
        coverFrontAxle.setInv(20);
        coverFrontAxle.setPrice(10.0);
        coverFrontAxle.setId(100L);
        coverFrontAxle.setMinInv(10);
        coverFrontAxle.setMaxInv(40);
        if(outsourcedPartRepository.findByName("Cover Front Axle").isEmpty())
            outsourcedPartRepository.save(coverFrontAxle);

        OutsourcedPart caseFrontGear = new OutsourcedPart();
        caseFrontGear.setCompanyName("Technical Tractor Co.");
        caseFrontGear.setName("Case Front Gear");
        caseFrontGear.setInv(5);
        caseFrontGear.setPrice(40.0);
        caseFrontGear.setId(200L);
        caseFrontGear.setMinInv(5);
        caseFrontGear.setMaxInv(20);
        if(outsourcedPartRepository.findByName("Case Front Gear").isEmpty())
            outsourcedPartRepository.save(caseFrontGear);

        InhousePart manifoldExhaust = new InhousePart();
        manifoldExhaust.setPartId(1882);
        manifoldExhaust.setName("Manifold Exhaust");
        manifoldExhaust.setInv(15);
        manifoldExhaust.setPrice(12.0);
        manifoldExhaust.setId(300L);
        manifoldExhaust.setMinInv(10);
        manifoldExhaust.setMaxInv(30);
        if(inhousePartRepository.findByName("Manifold Exhaust").isEmpty())
            inhousePartRepository.save(manifoldExhaust);

        InhousePart caseHydraulicCylinder = new InhousePart();
        caseHydraulicCylinder.setPartId(1899);
        caseHydraulicCylinder.setName("Case Hydraulic Cylinder");
        caseHydraulicCylinder.setInv(50);
        caseHydraulicCylinder.setPrice(5.0);
        caseHydraulicCylinder.setId(400L);
        caseHydraulicCylinder.setMinInv(15);
        caseHydraulicCylinder.setMaxInv(75);
        if(inhousePartRepository.findByName("Case Hydraulic Cylinder").isEmpty())
            inhousePartRepository.save(caseHydraulicCylinder);

        InhousePart caseBevelGear = new InhousePart();
        caseBevelGear.setPartId(1942);
        caseBevelGear.setName("Case Bevel Gear");
        caseBevelGear.setInv(10);
        caseBevelGear.setPrice(40.0);
        caseBevelGear.setId(300L);
        caseBevelGear.setMinInv(5);
        caseBevelGear.setMaxInv(25);
        if(inhousePartRepository.findByName("Case Bevel Gear").isEmpty())
            inhousePartRepository.save(caseBevelGear);


        Product everymansTractor= new Product("Everymans Tractor",500.0,30);
        if(productRepository.findByName("Everymans Tractor").isEmpty())
            productRepository.save(everymansTractor);

        Product slowTractor= new Product("Slow Tractor",300.0,20);
        if(productRepository.findByName("Slow Tractor").isEmpty())
            productRepository.save(slowTractor);

        Product strongTractor= new Product("Strong Tractor",750.0,50);
        if(productRepository.findByName("Strong Tractor").isEmpty())
            productRepository.save(strongTractor);

        Product humbleTractor= new Product("Humble Tractor",200.0,40);
        if(productRepository.findByName("Humble Tractor").isEmpty())
            productRepository.save(humbleTractor);

        Product richmansTractor = new Product("Richmans Tractor",1000.0,15);
        if(productRepository.findByName("Richmans Tractor").isEmpty())
            productRepository.save(richmansTractor);



        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
