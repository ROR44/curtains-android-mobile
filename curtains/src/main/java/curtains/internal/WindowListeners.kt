package curtains.internal

import curtains.OnContentChangedListener
import curtains.TouchEventInterceptor
import java.util.concurrent.CopyOnWriteArrayList

internal class WindowListeners {
  val touchEventInterceptors = CopyOnWriteArrayList<TouchEventInterceptor>()

  val onContentChangedListeners = CopyOnWriteArrayList<OnContentChangedListener>()
}