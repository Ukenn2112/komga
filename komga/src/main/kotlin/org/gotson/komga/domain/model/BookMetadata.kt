package org.gotson.komga.domain.model

import java.time.LocalDate
import java.time.LocalDateTime

class BookMetadata(
  title: String,
  summary: String = "",
  number: String,
  val numberSort: Float,
  val releaseDate: LocalDate? = null,
  val authors: List<Author> = emptyList(),
  tags: Set<String> = emptySet(),

  val titleLock: Boolean = false,
  val summaryLock: Boolean = false,
  val numberLock: Boolean = false,
  val numberSortLock: Boolean = false,
  val releaseDateLock: Boolean = false,
  val authorsLock: Boolean = false,
  val tagsLock: Boolean = false,

  val bookId: String = "",

  override val createdDate: LocalDateTime = LocalDateTime.now(),
  override val lastModifiedDate: LocalDateTime = LocalDateTime.now()
) : Auditable() {

  val title = title.trim()
  val summary = summary.trim()
  val number = number.trim()
  val tags = tags.map { it.toLowerCase().trim() }.filter { it.isNotBlank() }.toSet()

  fun copy(
    title: String = this.title,
    summary: String = this.summary,
    number: String = this.number,
    numberSort: Float = this.numberSort,
    releaseDate: LocalDate? = this.releaseDate,
    authors: List<Author> = this.authors.toList(),
    tags: Set<String> = this.tags,
    titleLock: Boolean = this.titleLock,
    summaryLock: Boolean = this.summaryLock,
    numberLock: Boolean = this.numberLock,
    numberSortLock: Boolean = this.numberSortLock,
    releaseDateLock: Boolean = this.releaseDateLock,
    authorsLock: Boolean = this.authorsLock,
    tagsLock: Boolean = this.tagsLock,
    bookId: String = this.bookId,
    createdDate: LocalDateTime = this.createdDate,
    lastModifiedDate: LocalDateTime = this.lastModifiedDate
  ) =
    BookMetadata(
      title = title,
      summary = summary,
      number = number,
      numberSort = numberSort,
      releaseDate = releaseDate,
      authors = authors,
      tags = tags,
      titleLock = titleLock,
      summaryLock = summaryLock,
      numberLock = numberLock,
      numberSortLock = numberSortLock,
      releaseDateLock = releaseDateLock,
      authorsLock = authorsLock,
      tagsLock = tagsLock,
      bookId = bookId,
      createdDate = createdDate,
      lastModifiedDate = lastModifiedDate
    )

  override fun toString(): String =
    "BookMetadata(numberSort=$numberSort, releaseDate=$releaseDate, authors=$authors, titleLock=$titleLock, summaryLock=$summaryLock, numberLock=$numberLock, numberSortLock=$numberSortLock, releaseDateLock=$releaseDateLock, authorsLock=$authorsLock, bookId=$bookId, createdDate=$createdDate, lastModifiedDate=$lastModifiedDate, title='$title', summary='$summary', number='$number')"
}
