package pkg;

import java.io.File;

public interface AtgArtifact {
  /**
   * Returns the module directory. This is the directory which normally has a META-INF/MANIFEST.MF child
   * directory and file.
   * @return A file object representing the directory where the module lives.
   */
  File getDir();

  /**
   * Returns a boolean indicating whether this module is part of the ATG framework installation. A custom module
   * built on top of the atg framework will returns false.
   * @return whether or not this module is part of the atg framework installation
   */
  boolean getIsAtgCore();

  /**
   * Returns an object representing the META-INF/MANIFEST.MF file for this module. For virtual modules this method
   * will return null.
   * @return An atg manifest object or null if this module has no manifest file.
   */
  String getManifest();
}
