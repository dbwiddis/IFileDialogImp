package dialog.jna;

import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinNT.HRESULT;
import com.sun.jna.platform.win32.COM.Unknown;

public class ModalWindow extends Unknown implements IModalWindow {

    // VTBL Id indexing starts at 3 after Unknown's 0, 1, 2

    public HRESULT Show(HWND hwndOwner) {
        return (HRESULT) this._invokeNativeObject(3, new Object[] { this.getPointer(), hwndOwner }, HRESULT.class);
    }
}
