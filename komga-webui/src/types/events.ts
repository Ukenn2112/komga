export const LIBRARY_ADDED = 'library-added'
export const LIBRARY_CHANGED = 'library-changed'
export const LIBRARY_DELETED = 'library-deleted'

export const BOOK_ADDED = 'book-added'
export const BOOK_CHANGED = 'book-changed'
export const BOOK_DELETED = 'book-deleted'
export const BOOK_IMPORTED = 'book-imported'

export const SERIES_ADDED = 'series-added'
export const SERIES_CHANGED = 'series-changed'
export const SERIES_DELETED = 'series-deleted'

export const COLLECTION_ADDED = 'collection-added'
export const COLLECTION_CHANGED = 'collection-changed'
export const COLLECTION_DELETED = 'collection-deleted'

export const READLIST_ADDED = 'readlist-added'
export const READLIST_CHANGED = 'readlist-changed'
export const READLIST_DELETED = 'readlist-deleted'

export const READPROGRESS_CHANGED = 'readprogress-changed'
export const READPROGRESS_DELETED = 'readprogress-deleted'
export const READPROGRESS_SERIES_CHANGED = 'readprogress-series-changed'
export const READPROGRESS_SERIES_DELETED = 'readprogress-series-deleted'

export const THUMBNAILBOOK_ADDED = 'thumbnailbook-added'
export const THUMBNAILSERIES_ADDED = 'thumbnailseries-added'

export const ERROR = 'error'

export interface ErrorEvent{
  message: string,
}
