/* Copyright (c) 2020 Daniel Widdis, All Rights Reserved
 *
 * The contents of this file is dual-licensed under 2
 * alternative Open Source/Free licenses: LGPL 2.1 or later and
 * Apache License 2.0. (starting with JNA version 4.0.0).
 *
 * You can freely decide which license you want to apply to
 * the project.
 *
 * You may obtain a copy of the LGPL License at:
 *
 * http://www.gnu.org/licenses/licenses.html
 *
 * A copy is also included in the downloadable source code package
 * containing JNA, in file "LGPL2.1".
 *
 * You may obtain a copy of the Apache License at:
 *
 * http://www.apache.org/licenses/
 *
 * A copy is also included in the downloadable source code package
 * containing JNA, in file "AL2.0".
 */
package dialog.jna;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;
import com.sun.jna.WString;

public interface ShTypes {

    @FieldOrder({ "pszName", "pszSpec" })
    class COMDLG_FILTERSPEC extends Structure {
        WString pszName;
        WString pszSpec;
    }

    interface FILEOPENDIALOGOPTIONS {
        int FOS_OVERWRITEPROMPT = 0x2;
        int FOS_STRICTFILETYPES = 0x4;
        int FOS_NOCHANGEDIR = 0x8;
        int FOS_PICKFOLDERS = 0x20;
        int FOS_FORCEFILESYSTEM = 0x40;
        int FOS_ALLNONSTORAGEITEMS = 0x80;
        int FOS_NOVALIDATE = 0x100;
        int FOS_ALLOWMULTISELECT = 0x200;
        int FOS_PATHMUSTEXIST = 0x800;
        int FOS_FILEMUSTEXIST = 0x1000;
        int FOS_CREATEPROMPT = 0x2000;
        int FOS_SHAREAWARE = 0x4000;
        int FOS_NOREADONLYRETURN = 0x8000;
        int FOS_NOTESTFILECREATE = 0x10000;
        int FOS_HIDEMRUPLACES = 0x20000;
        int FOS_HIDEPINNEDPLACES = 0x40000;
        int FOS_NODEREFERENCELINKS = 0x100000;
        int FOS_OKBUTTONNEEDSINTERACTION = 0x200000;
        int FOS_DONTADDTORECENT = 0x2000000;
        int FOS_FORCESHOWHIDDEN = 0x10000000;
        int FOS_DEFAULTNOMINIMODE = 0x20000000;
        int FOS_FORCEPREVIEWPANEON = 0x40000000;
        int FOS_SUPPORTSTREAMABLEITEMS = 0x80000000;
    }

}
