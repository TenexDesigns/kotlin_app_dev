Intent- Is an intention to do something. E.g navigate from one activity to another.

Since our intention is to move to as second activity.
We use the class of Intent()
Since we are moving from one activity to another ,we have to pass in our current context and the address of the second actvity.This address also contains theconcept of Kotlin reflection e.g SecondActivity::Class.java
Then use StartAcity() and pass in the intent as a parameter .This is enough to navigate to  the next activity.

        button.setOnClickListener {
            var intent = Intent(this,secondActivity::class.java)
            startActivity(intent)

        }























