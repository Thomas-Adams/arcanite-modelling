package org.arcanite.idm.codegen;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class PackageHelper {
  public static List<EClass> getAllClasses(final EPackage ePackage) {
    final Predicate<Object> _function = (Object p) -> {
      return EClass.class.isInstance(p);
    };
    final Function<Object, EClass> _function_1 = (Object e) -> {
      return EClass.class.cast(e);
    };
    List<EClass> allPkgClasses = ePackage.getEClassifiers().stream().filter(_function).<EClass>map(_function_1).collect(Collectors.<EClass>toList());
    return allPkgClasses;
  }
}
