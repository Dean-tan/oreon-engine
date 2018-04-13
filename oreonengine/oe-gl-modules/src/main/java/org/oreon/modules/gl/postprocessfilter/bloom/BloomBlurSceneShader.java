package org.oreon.modules.gl.postprocessfilter.bloom;

import org.oreon.core.gl.pipeline.GLShaderProgram;
import org.oreon.core.util.ResourceLoader;

public class BloomBlurSceneShader extends GLShaderProgram{

	private static BloomBlurSceneShader instance = null;
	
	public static BloomBlurSceneShader getInstance() 
	{
	    if(instance == null) 
	    {
	    	instance = new BloomBlurSceneShader();
	    }
	      return instance;
	}
	
	protected BloomBlurSceneShader()
	{
		super();
		
		addComputeShader(ResourceLoader.loadShader("shaders/computing/Bloom/BloomBlurScene_CS.glsl"));
		
		compileShader();
	}
}
