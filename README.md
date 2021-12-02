# Contacts kata

*Goal: measure the performance of an application using sql,
with and without index*.

# Steps

* Start with java, javascript or Python (warning: javascript is harder)

* Change the code so that you can generate up to 1million contacs
and store them in the db.

* Fill up the following table

| size of the db | time of the query |
|----------------|-------------------|
| 10             |                   |
| 100            |                   |
| 1000           |                   |
| ...            |                   |
| 100000         |                   |

* Now introduce an index

```sql
CREATE UNIQUE INDEX index_emails ON contacts(emails);
```

* Redo the measurements
