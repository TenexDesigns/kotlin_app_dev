
        var view:View = findViewById(R.id.view)



        view.setOnLongClickListener{
            val cliptext = "This is the clip text"
            val item = ClipData.Item(cliptext)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(cliptext,mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)
            it.visibility = View.INVISIBLE
            true




        }

        val dragListener = View.OnDragListener{ view,event ->

            when(event.action){
                DragEvent.ACTION_DRAG_STARTED ->{
                event.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)

                }
                DragEvent.ACTION_DRAG_ENTERED ->{
                    view.invalidate()
                    true
                }
                DragEvent.ACTION_DRAG_LOCATION -> true
                DragEvent.ACTION_DRAG_EXITED -> {
                    view.invalidate()
                    true
                }
                DragEvent.ACTION_DROP ->{
                    val item = event.clipData.getItemAt(0)
                    val dragData = item.text
                    Toast.makeText(this,"Data is ok",Toast.LENGTH_LONG).show()

                    val v = event.localState as View

                    val owner = v.parent as ViewGroup
                    owner.removeView(v)
                    val destination = view as LinearLayout
                    destination.addView(v)
                    v.visibility = View.VISIBLE
                    true
                }

                DragEvent.ACTION_DRAG_ENDED -> {
                    view.invalidate()
                    true
                }



                else -> false
            }

        }
        
        
        
        Use the explanntion here below


val imageView = ImageView(this)

// Set the drag event listener for the View.
imageView.setOnDragListener { v, e ->

    // Handles each of the expected events.
    when (e.action) {
        DragEvent.ACTION_DRAG_STARTED -> {
            // Determines if this View can accept the dragged data.
            if (e.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
                // As an example of what your application might do, applies a blue color tint
                // to the View to indicate that it can accept data.
                (v as? ImageView)?.setColorFilter(Color.BLUE)

                // Invalidate the view to force a redraw in the new tint.
                v.invalidate()

                // Returns true to indicate that the View can accept the dragged data.
                true
            } else {
                // Returns false to indicate that, during the current drag and drop operation,
                // this View will not receive events again until ACTION_DRAG_ENDED is sent.
                false
            }
        }
        DragEvent.ACTION_DRAG_ENTERED -> {
            // Applies a green tint to the View.
            (v as? ImageView)?.setColorFilter(Color.GREEN)

            // Invalidates the view to force a redraw in the new tint.
            v.invalidate()

            // Returns true; the value is ignored.
            true
        }

        DragEvent.ACTION_DRAG_LOCATION ->
            // Ignore the event.
            true
        DragEvent.ACTION_DRAG_EXITED -> {
            // Resets the color tint to blue.
            (v as? ImageView)?.setColorFilter(Color.BLUE)

            // Invalidates the view to force a redraw in the new tint.
            v.invalidate()

            // Returns true; the value is ignored.
            true
        }
        DragEvent.ACTION_DROP -> {
            // Gets the item containing the dragged data.
            val item: ClipData.Item = e.clipData.getItemAt(0)

            // Gets the text data from the item.
            val dragData = item.text

            // Displays a message containing the dragged data.
            Toast.makeText(this, "Dragged data is $dragData", Toast.LENGTH_LONG).show()

            // Turns off any color tints.
            (v as? ImageView)?.clearColorFilter()

            // Invalidates the view to force a redraw.
            v.invalidate()

            // Returns true. DragEvent.getResult() will return true.
            true
        }

        DragEvent.ACTION_DRAG_ENDED -> {
            // Turns off any color tinting.
            (v as? ImageView)?.clearColorFilter()

            // Invalidates the view to force a redraw.
            v.invalidate()

            // Does a getResult(), and displays what happened.
            when(e.result) {
                true ->
                    Toast.makeText(this, "The drop was handled.", Toast.LENGTH_LONG)
                else ->
                    Toast.makeText(this, "The drop didn't work.", Toast.LENGTH_LONG)
            }.show()

            // Returns true; the value is ignored.
            true
        }
        else -> {
            // An unknown action type was received.
            Log.e("DragDrop Example", "Unknown action type received by View.OnDragListener.")
            false
        }
    }
}


// Container for where the image is to be dropped in the target app.
val targetImageView = findViewById<ImageView>(R.id.imageView)

targetImageView.setOnDragListener { view, event ->

    when (event.action) {

        ACTION_DROP -> {
            val imageItem: ClipData.Item = event.clipData.getItemAt(0)
            val uri = imageItem.uri

            // Request permission to access the image data being dragged into
            // the target activity's ImageView element.
            val dropPermissions = requestDragAndDropPermissions(event)
            (view as ImageView).setImageURI(uri)

            // Release the permission immediately afterwards because it's
            // no longer needed.
            dropPermissions.release()
            return@setOnDragListener true
        }

        // Implement logic for other DragEvent cases here.

        // An unknown action type was received.
        else -> {
            Log.e("DragDrop Example", "Unknown action type received by View.OnDragListener.")
            return@setOnDragListener false
        }

    }
}
