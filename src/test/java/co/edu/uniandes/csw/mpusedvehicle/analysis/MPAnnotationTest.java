package co.edu.uniandes.csw.mpusedvehicle.analysis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.edu.uniandes.csw.mp.processing.MPAnnotationProcessorSpoon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.code.CtIf;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;

/**
 *
 * @author USUARIO
 */
public class MPAnnotationTest {
    
    public MPAnnotationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    @Test
	public void testBoundProcessor() throws Exception {
		SpoonAPI launcher = new Launcher();
		launcher.getEnvironment().setNoClasspath(true);
		launcher.addInputResource("./src/main/java");
		launcher.setSourceOutputDirectory("./target/spoon-processor");
                launcher.addProcessor(new MPAnnotationProcessorSpoon());
		launcher.run();

	}
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
