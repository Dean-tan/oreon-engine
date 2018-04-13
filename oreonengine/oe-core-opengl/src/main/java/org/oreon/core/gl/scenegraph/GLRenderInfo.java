package org.oreon.core.gl.scenegraph;

import org.oreon.core.gl.buffer.VBO;
import org.oreon.core.gl.parameter.RenderParameter;
import org.oreon.core.gl.pipeline.GLShaderProgram;
import org.oreon.core.scenegraph.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GLRenderInfo extends Component{
	
	private GLShaderProgram shader;
	private RenderParameter config;
	private VBO vbo;
	
	@Override
	public void render(){
		
		config.enable();
		shader.bind();			
		shader.updateUniforms(getParent());
		vbo.draw();
		config.disable();
	}

}
