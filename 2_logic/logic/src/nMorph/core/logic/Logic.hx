package nMorph.core.logic;


import nMorph.core.logic.category.CategoryLogic;
import nMorph.core.logic.person.PersonLogic;
import nMorph.core.logic.task.TaskLogic;

/**
 * ...
 * @author Smartwork
 */
class Logic 
{

	public function new() 
	{
		
	}
	
	public static function main (){
		Type.getClass(CategoryLogic);
		Type.getClass(PersonLogic);
		Type.getClass(TaskLogic);
		
	}
	
}
