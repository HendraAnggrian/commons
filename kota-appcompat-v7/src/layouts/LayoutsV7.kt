@file:JvmMultifileClass
@file:JvmName("ViewsV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.view.menu.ListMenuItemView
import android.support.v7.widget.*
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout

interface LinearLayoutCompatParameterizable<LP : LinearLayoutCompat.LayoutParams> : MarginLayoutParameterizable<LP> {
    infix fun <V : View> V.gravity(gravity: Int): V = apply { lparams.gravity = gravity }
    infix fun <V : View> V.weight(weight: Float): V = apply { lparams.weight = weight }

    val View.gravity: Int get() = lparams.gravity
    val View.weight: Float get() = lparams.weight
}

class _ActionBarContainer(context: Context) : ActionBarContainer(context), FrameLayoutParameterizable<FrameLayout.LayoutParams>

class _ActionBarOverlayLayout(context: Context) : ActionBarOverlayLayout(context), LayoutParameterizable<ViewGroup.LayoutParams>

class _ActionMenuViewV7(context: Context) : ActionMenuView(context), LinearLayoutCompatParameterizable<ActionMenuView.LayoutParams> {
    infix fun <V : View> V.overflowButton(overflow: Boolean): V = apply { lparams.isOverflowButton = overflow }
    infix fun <V : View> V.cellsUsed(cells: Int): V = apply { lparams.cellsUsed = cells }
    infix fun <V : View> V.extraPixels(pixels: Int): V = apply { lparams.extraPixels = pixels }
    infix fun <V : View> V.expandable(expandable: Boolean): V = apply { lparams.expandable = expandable }
    infix fun <V : View> V.preventEdgeOffset(prevent: Boolean): V = apply { lparams.preventEdgeOffset = prevent }

    val View.isOverflowButton: Boolean get() = lparams.isOverflowButton
    val View.cellsUsed: Int get() = lparams.cellsUsed
    val View.extraPixels: Int get() = lparams.extraPixels
    val View.expandable: Boolean get() = lparams.expandable
    val View.preventEdgeOffset: Boolean get() = lparams.preventEdgeOffset
}

class _AlertDialogLayout(context: Context) : AlertDialogLayout(context), LinearLayoutCompatParameterizable<LinearLayoutCompat.LayoutParams>

class _ButtonBarLayout(context: Context) : ButtonBarLayout(context, null), LinearLayoutParameterizable<LinearLayout.LayoutParams>

@SuppressLint("ViewConstructor")
class _LinearLayoutCompat(context: Context, orientation: Int) : LinearLayoutCompat(context), LinearLayoutCompatParameterizable<LinearLayoutCompat.LayoutParams> {
    init {
        setOrientation(orientation)
    }
}

class _ListMenuItemView(context: Context) : ListMenuItemView(context, null), LinearLayoutParameterizable<LinearLayout.LayoutParams>

class _ListViewCompatV7(context: Context) : ListViewCompat(context), LinearLayoutCompatParameterizable<LinearLayoutCompat.LayoutParams>