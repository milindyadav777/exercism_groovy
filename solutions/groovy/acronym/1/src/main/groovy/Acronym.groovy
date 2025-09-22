class Acronym {

    static String abbreviate(String phrase) {
        return phrase.replaceAll(/[^\w\s\-_]/, '') // Remove special chars except word chars, spaces, hyphens, underscores
                .split(/[\s\-_]+/) // Split by spaces, hyphens, underscores
                .findAll { it.trim() && it.length() > 0 } // Remove empty strings
                .collect { it.charAt(0).toUpperCase() } // Take first letter and make uppercase
                .join('')
    }
}