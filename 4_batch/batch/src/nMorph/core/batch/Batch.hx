package nMorph.core.batch;

import nMorph.core.batch.configuration.Initializer;
import haxe.io.Path;
import nMorph.framework.common.helpers.SerializationHelper;
import nMorph.framework.orm.configuration.Configuration;
import sys.FileSystem;
/**
 * ...
 * @author Smartwork
 */
class Batch
{

	public static function main(){
		
		//DEV
		//Initializer.Application_Start(Path.addTrailingSlash(FileSystem.absolutePath("config")));

		//UAT
		Initializer.Application_Start("..//Config//");	
		
	}
}
