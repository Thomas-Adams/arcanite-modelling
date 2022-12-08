package org.arcanite.idm;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xcore.generator.XcoreGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class ArcaniteXCoreGenerator extends XcoreGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _filter = Iterables.<EObject>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), EObject.class);
    for (final EObject o : _filter) {
      this.compile(o, fsa);
    }
  }
  
  public void compile(final EObject e, final IFileSystemAccess fsa) {
    String _name = e.eClass().getName();
    String _plus = (_name + ".txt");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this is element ");
    String _name_1 = e.eClass().getName();
    _builder.append(_name_1);
    _builder.newLineIfNotEmpty();
    fsa.generateFile(_plus, _builder);
  }
}
